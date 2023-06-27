package Seminars.Part_2.lesson1;

public class B extends A {

    private String a;

    public B(int a, int b, int c) {
        super(a, b, c);
//        super.a = a;
//        System.out.println("Конструктор Б");
    }

    @Override
    public void run() {
        System.out.println("B RUN!");
    }

    public B(int a, int b) {
       this(a, b, -1);
    }

    public B(int a) {
        this(a, -1);
    }

    public B() {
        this(-1);
    }

    @Override
    public String toString() {
        return String.format("a: %s, b:%s, c:%s%n", a, getB(), getC());
    }

    public void study() {
        System.out.println("ГРЫЗЕМ ГРАНИТ");
    }
}
