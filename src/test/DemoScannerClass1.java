package test;

import java.util.Scanner;

public class DemoScannerClass1 {
    public static void main(String[] args) {
String s = "Welcome";
        Scanner scan = new Scanner(s);

        System.out.println(scan.hasNext());
        System.out.println(scan.nextLine());
scan.close();
        System.out.println("------Enter Your INFORMATION----");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name= in.next();
        System.out.println("Name: "+name);
        System.out.println("Enter your age");
        int i = in.nextInt();
        System.out.println("age: "+i);
        System.out.println("Enter your country");
        String country = in.next();
        System.out.println("the country is: "+country);
        in.close();
    }
}
