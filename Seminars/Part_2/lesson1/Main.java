package Seminars.Part_2.lesson1;

public class Main {
    public static void main(String[] args) {
        B b1 = new B(1, 2, 3);
//        new A(1, 2, 3);
        A b2 = new B(1, 2);
        Object b3 = new B(1);
        new B(0);

        b1.run();
        b1.sing();
        b1.study();
        System.out.println("Проверка toString: " + b1.toString());

        b2.run();
        b2.sing();
//        b2.study();
        System.out.println("Проверка toString: " + b2.toString());

/*        if (b2 instanceof B) {
            B newB = (B)b2;
            newB.study();
        }*/

        if (b2 instanceof B newB) {
//            B newB = (B)b2;
            newB.study();
        }

//        b3.run();
//        b3.sing();
//        b3.study();
        if (b3 instanceof A newB) {
            newB.run();
            newB.sing();
        }
        System.out.println("Проверка toString: " + b3.toString());



        G g = new G(9, 4, 5);
        g.run();
        g.sing();

//        A.class
//        b1.getClass();
        System.out.println(A.getCount());
    }
}