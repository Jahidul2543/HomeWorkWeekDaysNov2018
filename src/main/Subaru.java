package main;

public class Subaru {
    int a=5;
    int b=10;
    int c=a+b;
    int d=a-b;

    public void add() {

        System.out.println(c);
    }
    public void subtract(){

        System.out.println("my result" + d);
    }
    public static void main(String[]args){

        Subaru sedan = new Subaru();
        Subaru suv = new Subaru();

        sedan.add();
        suv.subtract();

    }

}
