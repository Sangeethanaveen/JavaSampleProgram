package javafundamental;

public class math {
    public void add(int x, int y) {
        int sum = x + y;
        System.out.println("Sum is" + sum);
    }
}

class Addition extends math {
    public void add(int x, int y) {
        int sum = x + y;
        System.out.println("Sum is from addition" + sum);


    }

    public void add(float x, float y) {
        float sum = x + y;
        System.out.println("Sum is from addition" + sum);
    }
}

class Trigger extends Addition{
    public static void main(String[] args) {
        Trigger t = new Trigger();
        t.add(2,3);

    }
}