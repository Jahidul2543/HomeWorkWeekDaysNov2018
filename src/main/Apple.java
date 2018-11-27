package main;

public class Apple {
    int model;
    int capacity;
    String name;

    public void appleInfo(){

        System.out.println("This object have"+model+"apple" +capacity+ " Mac " +name);
    }
   public void applememory(){
    System.out.println("I love my phone");
    }

    public static void main(String[]args){
        Apple iPhone=new Apple();
        iPhone.model=8;
        iPhone.capacity=64;
        iPhone.name="Iphone 8";

        iPhone.appleInfo();
        iPhone.applememory();




}








}
