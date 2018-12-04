package HomeWorkWeekDaysNov2018;

public class GeneralPractice {


    public static void main(String[] args) {

        int x = 1_00; // use underscore in numbers to read easily
        int y = 10;

        System.out.println(x*y);
        // USing increment and decrement operator
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);
        y--;
        System.out.println(--y + ++x);

        // converting String to int

        String number = "1000";
        // using Integer.parseInt method
        System.out.println("The Valus is : "+2*Integer.parseInt(number));
        // Using Interger.Value of method
        System.out.println("The value is: "+3*Integer.valueOf(number));
        // converting String value to int
        int number1 =10;
        System.out.printf("The number is %s \n",String.valueOf(number1));
        System.out.println(Integer.toString(number1));
        // Integer.parseInt(); String>>>>>>>>>int
        // Integer.toString(); int >>>>>>>>>.String

        // reverser String


    }
}


