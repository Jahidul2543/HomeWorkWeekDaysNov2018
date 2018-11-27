package main;

public class Laptop {
    String brand;
    String color;
    String name;
    int model;
    int capacity;

public void laptopBrand(){
    System.out.println("name of the laptop brand is"+brand);
}

public void laptopColor(){
    System.out.println("Color of the laptop is"+color);
}

public void laptopName(){
    System.out.println("name of the laptop is"+name);
}

public void laptopModel(){
    System.out.println("laptop model is"+model);
}

public void laptopCapacity(){
    System.out.println("capacity of for the laptop is"+capacity);
}

public static void main(String[]args){
    Laptop asif=new Laptop();
    asif.brand="Apple";
    asif.color="space grey";
    asif.name="MacBook Pro";
    asif.model=10;
    asif.capacity=256;

    Laptop mimi=new Laptop();
    mimi.brand="Dell";
    mimi.color="black";
    mimi.name="XPS";
    mimi.model=12;
    mimi.capacity=1000;

    Laptop shakh=new Laptop();
    shakh.brand="Sony";
    shakh.color="silver";
    shakh.name="Acer";
    shakh.model=8;
    shakh.capacity=500;

    Laptop absana=new Laptop();
    absana.brand="HP";
    absana.color="white";
    absana.name="windows";
    absana.model=9;
    absana.capacity=500;

    Laptop fahmida=new Laptop();
    fahmida.name="Samsung";
    fahmida.color="black";
    fahmida.brand="Sam";
    fahmida.model=12;
    fahmida.capacity=500;

    asif.laptopBrand();
    asif.laptopCapacity();
    asif.laptopColor();
    asif.laptopModel();
    asif.laptopName();

    mimi.laptopModel();
    mimi.laptopName();
    mimi.laptopColor();
    mimi.laptopCapacity();
    mimi.laptopBrand();

    shakh.laptopCapacity();
    shakh.laptopBrand();
    shakh.laptopColor();
    shakh.laptopName();
    shakh.laptopModel();

    absana.laptopName();
    absana.laptopModel();
    absana.laptopColor();
    absana.laptopBrand();
    absana.laptopCapacity();

    fahmida.laptopBrand();
    fahmida.laptopCapacity();
    fahmida.laptopColor();
    fahmida.laptopModel();
    fahmida.laptopName();
}










}
