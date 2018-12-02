package test;

public class TryCatchDemo {
    public static void main(String[] args) {
        int x=2;
       try{
           int divide=2/0;
       }
       catch (ArithmeticException Arnob){
           Arnob.printStackTrace();
           System.out.println("You can't devide by 0");

        }




        System.out.println("result");
    }
}
