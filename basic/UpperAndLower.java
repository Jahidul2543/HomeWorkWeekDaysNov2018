package basic;

import java.util.Scanner;

public class UpperAndLower {
    String sentence;
    public void UpperAndLower(String sentence){
        this.sentence = sentence;
        System.out.printf(" %2s \n",this.sentence.toUpperCase());
        System.out.printf(" %2s \n",this.sentence.toLowerCase());

    }

    public static void main(String[] args) {
        UpperAndLower obj1 = new UpperAndLower();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the sentence to convert to Upper and lower case");
        String entered = userInput.nextLine();
        obj1.UpperAndLower(entered);

    }
}
