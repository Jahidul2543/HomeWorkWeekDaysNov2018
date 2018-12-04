package HomeWorkWeekDaysNov2018;

import java.util.Scanner;

public class StringMethod4 {

    Scanner scan = new Scanner(System.in);



    public int userInput3(){
        System.out.println("Enter any sentence to check the length");
        String b = scan.nextLine();
        return  b.length();
        }


    public static void main(String[] args) {
        StringMethod4 obj1 = new StringMethod4();
        System.out.printf("The result is %d\n",obj1.userInput3());
    }
}
