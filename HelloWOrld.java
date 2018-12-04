package HomeWorkWeekDaysNov2018;

import java.lang.String;

public class HelloWOrld {




    // made a class vairable
    static String greetings = "Hello World!!";
    // made a instant variable
    String message2 = "Hello again!";

    public static void main(String[] args) {
        // calling class variable
        System.out.println(greetings);

        HelloWOrld obj1 = new HelloWOrld();
        // calling instant variable
        System.out.println(obj1.message2);


    }
}
