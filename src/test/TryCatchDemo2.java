package test;

public class TryCatchDemo2 {
    int i = 1;

    public static void main(String[] args) {


        try {
            int divide = 2 / 0;


        } catch (ArithmeticException Aysee) {
            Aysee.printStackTrace();
            System.out.println("This is the math");

        }
        System.out.println("tata");

    }
}
