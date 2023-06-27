package Seminars.Part_2.lesson1;

public abstract class A {

    private static int count;

    protected int a;

    private int b;
    private int c;
    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        count++;
//        System.out.println("Конструктор А");
        System.out.printf("a: %s, b:%s, c:%s%n", a, b, c);

    }

    public static int getCount() {
        return count;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void sing() {
        System.out.println("LAL ALALALAL" + (a + b + c));
    }

    public abstract void run();

}
