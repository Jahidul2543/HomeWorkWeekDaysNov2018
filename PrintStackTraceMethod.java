package HomeWorkWeekDaysNov2018;

public class PrintStackTraceMethod {

    public static void main(String[] args) {
        try {
            System.out.println("Hello!!!!!!!!!!!!");
            System.out.println("Hello!!!!!!!!!!!!");
            System.out.println("Hello!!!!!!!!!!!!");
            System.out.println("Hello!!!!!!!!!!!!");
            System.out.println("Hello!!!!!!!!!!!!");
            System.out.println(":)");
            System.out.println(":)");
            int x = 10;
            System.out.println(x);
            System.out.println(x / 0);
            // the code below will not execute to console
            System.out.println("WOrld");
            System.out.println("WOrld");
            System.out.println("WOrld");
            System.out.println("WOrld");
            System.out.println("WOrld");
            System.out.println("WOrld");
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("Stupid!!! check your code");
            System.out.println("Try and Exception is important Concept for Testing");
        }
try{
        System.out.println("Program continues  ");

        System.out.println("Program continues  ");

        System.out.println("Program continues  ");

        System.out.println("Program continues  ");
        System.out.println(10/0);
        // program terminate after finding Airthematic error  and jumps to catch block
        System.out.println("After error  ");

        System.out.println("Program continues  ");

        System.out.println("Program continues  ");

        System.out.println("Program continues  ");}
catch(Throwable e){
    e.printStackTrace();
    System.out.println("Block after Hello World");
}
        try{System.out.println(10/10);
        System.out.println("So we can not divide by 0");}
        catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("Bye");
        }


    }
}

