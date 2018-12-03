package main;

public class Count {
    int a=5;
    int b=10;
    int c=a+b;
    int d=a-b;

    public void add() {

        System.out.println("Count Result is " + c);
    }
    public void subtract(){

        System.out.println("Count Result is " + d);
    }
    public static void main(String[]args){

        Count A = new Count();
        Count B = new Count();

        A.add();
        B.subtract();

    }

}
