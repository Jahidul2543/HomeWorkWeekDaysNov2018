package HomeWorkWeekDaysNov2018.revision;

public class ScopeOfStaticWord {

    static int a = 10;

    static int b = 15;

    int c = 20;

    int d = 40;


    public static void addition1(){
        // calling static variable in the method
        System.out.println("The line is printing from addition1 : "+(a+b));
    }

    public static void addition2(){

        // cannot call non static varaible c and d here cause the method is also static
//        System.out.println(c+d);

            addition1(); // this is recursion when you calling one method from the other
            System.out.println("This line is printing from addition2 ");
        }

        //now next method is not static so we can call the non static variables as well as the static variables

    public void addition3(){

        addition2();
        System.out.println("This line is printing from addition3");

    }

}
