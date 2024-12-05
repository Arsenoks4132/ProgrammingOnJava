package practise_14;

public class Subject {
    private Observer[] subs;

    public Subject(Observer[] subs) {
        this.subs = subs;
    }

    public void event() {
        for (Observer sub : subs) {
            sub.notify_sub();
        }
    }
}
