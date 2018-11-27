package main;

public class Drinks {

    int a = 10;
    int b = 20;
    int c = a + b;
    int d = a - b;

    public void add(){
        System.out.println(c);
    }
    public void sub(){
        System.out.println("my result" +d);
    }
    public static void main(String[]args){

        Drinks pepsi = new Drinks();
        Drinks coke = new Drinks();
        Drinks sprite = new Drinks();
        Drinks crush = new Drinks();

        pepsi.add();
        coke.sub();





    }


}
