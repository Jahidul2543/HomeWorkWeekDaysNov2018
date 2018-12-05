package test;

import java.util.Scanner;

public class ScannerClassExample1 {

    public static void main(String[] args) {

        String s= "Hello, This is JavaTutorial.";

        Scanner scan = new Scanner(s);

        System.out.println("Boolean result"+scan.hasNext());

        System.out.println("String"+scan.nextLine());

        scan.close();
        System.out.println("------Enter details------");

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name= scanner2.next();
        System.out.println("Name: "+ name);
        System.out.println("Enter Your Age: ");
        int i = scanner2.nextInt();
        System.out.println("Age id: "+i);
        System.out.println("Enter Your Salary ");
        double d = scanner2.nextDouble();
        System.out.println("salay is"+d);
        scanner2.close();






    }

}
