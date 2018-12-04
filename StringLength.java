package HomeWorkWeekDaysNov2018;

import java.util.Scanner;

public class StringLength {

    Scanner scan = new Scanner(System.in);

    // defining method to get user input
    public String userInput(){
        System.out.println("Enter Any Sentence to see how many character you write!!!");
        return scan.nextLine();
    }

    String userSentence = new String(userInput());

    public static void main(String[] args) {
        StringLength obj1 = new StringLength();
        // invoking three function at the same time
        //>>>User obj refers to instance variable >>>refers to parameter as method
        System.out.println("You Enter :"+ obj1.userSentence);
        System.out.printf("the length of your character is %d\n",obj1.userSentence.length());

        System.out.printf("The length multiple by 2 is =%d\n",obj1.userSentence.length()*2);

    }
}
