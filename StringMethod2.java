package HomeWorkWeekDaysNov2018;

import java.util.Scanner;

public class StringMethod2 {



    //passing method as parameter to ask user to provide information

    Scanner scan = new Scanner(System.in);

    public String getPrimeMinister(){
        System.out.println("Enter Prime Minister name of your Country");

        return scan.nextLine();
    }
    // passing method argument to create a String

    String primeMinister = new String (getPrimeMinister());

    public static void main(String[] args) {

        StringMethod2 obj1 = new StringMethod2();
        System.out.printf("The name of the prime minister is %s\n",obj1.primeMinister);
        System.out.printf("He is  %s, a good person\n",obj1.primeMinister);
        System.out.println("GeekforGeek".length());
        "GeekforGeek".length();
    }

    }
