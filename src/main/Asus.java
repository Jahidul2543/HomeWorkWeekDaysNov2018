package main;

public class Asus {

    int code;
    int space;
    int year;

    public void asusInfo(){
        System.out.println("the product code "+code+" space "+space+" gb make year "+year);
    }

    public static void main(String[]args){
        System.out.println("I am done");

        Asus jenPhn = new Asus();
        jenPhn.code= 1000;
        jenPhn.space= 100;
        jenPhn.year= 2018;

        Asus laptop = new Asus();
        laptop.code= 1025;
        laptop.space= 64;
        laptop.year= 2017;

        Asus tablet = new Asus();
        tablet.code= 2398;
        tablet.space= 128;
        tablet.year= 2019;

   jenPhn.asusInfo();
   laptop.asusInfo();
   tablet.asusInfo();

    }
}
