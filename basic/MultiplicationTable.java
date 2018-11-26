package basic;


import java.util.Scanner;

public class MultiplicationTable {

    public void MultiplicationTable(){

        Scanner number = new Scanner(System.in);
        System.out.println("Enter the Number to get Table up to 10");
        int x = number.nextInt();
        for (int i =1; i <=10; i ++){
            System.out.printf("%2d) %2d x %2d = %2d\n",i,x,i,x*i);
        }

    }

    public static void main(String[] args) {
        MultiplicationTable obj1 = new MultiplicationTable();

        obj1.MultiplicationTable();
    }

}
