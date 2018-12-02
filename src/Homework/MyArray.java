package Homework;

public class MyArray {
    public static void main(String[] args) {
        int anArray[];
        anArray = new int[10];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;


        System.out.println("Print the value of "+ anArray[0]);
        System.out.println("Print the value of "+anArray[1]);
        System.out.println("Print the value of "+anArray[2]);
        System.out.println("Print the value of "+anArray[3] +"Also print the value of"+anArray[4]+anArray[5]+"Also"+anArray[6]);


        String myArray[];

        myArray=new String[3];

        myArray[0]= "Ziyad";
        System.out.println(myArray[0]);
        myArray[1]= "Hussain";

        //accessing the value from top class
        System.out.println("Print the value" + anArray[2]);
        myArray[2]= "Khan";
    }




    }

