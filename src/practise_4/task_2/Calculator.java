package practise_4.task_2;

public class Calculator implements Mathematicae{
    public int add(int a, int b) {
        return a + b;
    }
    public int inv(int a) {
        return -a;
    }

    public int sum(int a, int b) {
        return this.add(a, b);
    }

    public int sub(int a, int b) {
        return this.add(a, this.inv(b));
    }

    public int mul(int a, int b) {
        if (a < 0) {
            a = this.inv(a);
            b = this.inv(b);
        }
        int res = 0;
        for (int i = 0; i < a; i = this.add(i, 1)) {
            res = this.add(res, b);
        }
        return res;
    }

    public int div(int a, int b) {
        if (a < 0) {
            a = this.inv(a);
            b = this.inv(b);
        }
        int res = 0;
        int d = 1;
        if (b < 0) {
            d = this.inv(d);
            b = this.inv(b);
        }
        while (a >= b) {
            res = this.add(res, d);
            a = this.sub(a, b);
        }
        return res;
    }


    public int mod(int a, int b) {
        return this.sub(a, this.mul(this.div(a, b), b));
    }
}
