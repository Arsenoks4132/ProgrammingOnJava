package practise_15;

import java.io.*;
import java.net.*;
import java.util.*;

public class HttpRandom {
    private static final int PORT = 66;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {

            System.out.println("Note HTTP Server запущен на порту " + PORT);
            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    handleClient(clientSocket);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка запуска сервера: " + e.getMessage());
        }
    }

    private static void handleClient(Socket clientSocket) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
        String line = in.readLine();
        if (line == null) return;
        String[] requestParts = line.split(" ");
        String method = requestParts[0];
        if (!method.equals("GET")) {
            sendHttpResponse(out, 400, "<h1>Method not allowed</h1>");
            return;
        }

        try {
            String[] pathParts = requestParts[1].split("\\?");
            String path = pathParts[0];
            if (!path.equals("/random")) {
                sendHttpResponse(out, 404, "<h1>Path not found</h1>");
                return;
            }
            String[] params = pathParts[1].split("&");
            if (params.length != 2) {
                sendHttpResponse(out, 400, "<h1>Wrong request parameters</h1>");
                return;
            }
            int min = 1, max = 0;
            for (String param : params) {
                String[] item = param.split("=");
                if (item[0].equals("min")) {
                    min = Integer.parseInt(item[1]);
                } else if (item[0].equals("max")) {
                    max = Integer.parseInt(item[1]);
                } else {
                    throw new Exception();
                }
            }
            if (min > max) {
                sendHttpResponse(out, 400, "<h1>Wrong request parameters</h1>");
                return;
            }
            Random rn = new Random();
            sendHttpResponse(out, 200, "<h1>" + (rn.nextInt((max - min) + 1) + min) + "</h1>");
        } catch (Exception e) {
            sendHttpResponse(out, 400, "<h1>Bad request</h1>");
            return;
        }
    }

    private static void sendHttpResponse(PrintWriter out, int statusCode, String body) {
        out.println("HTTP/1.1 " + statusCode + " OK");
        out.println("Content-Type: text/html");
        out.println("Content-Length: " + body.length());
        out.println();
        out.println(body);
        out.flush();
    }
}