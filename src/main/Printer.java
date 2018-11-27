package main;

public class Printer {
    String brand;
    String color;
    String type;
    int model;
    int tray;
public void printerInfo(){
    System.out.println("This"+brand+"have"+color+"and its a"+type+"printer"+model+"with this many"+tray);

}

public void printerBrand(){
    System.out.println("this is"+brand);
}

public void printerColor(){
    System.out.println("the color of the printer is"+color);
}

public void printerType(){
    System.out.println("this printer is a"+type);
}

public void printerModel(){
    System.out.println("The printer model is"+model);
}

public void amopuntOftray(){
    System.out.println("This printer have"+tray);
}

public static void main(String[]args){
    Printer shakh=new Printer();
    shakh.brand="dell";
    shakh.color="blue";
    shakh.type="laser";
    shakh.model=9;
    shakh.tray=1;

    Printer shakib=new Printer();
    shakib.brand="HP";
    shakib.color="gray";
    shakib.type="laser";
    shakib.model=8;
    shakib.tray=2;

    Printer fahmida=new Printer();
    fahmida.brand="toshiba";
    fahmida.color="pink";
    fahmida.type="ink";
    fahmida.model=10;
    fahmida.tray=3;

    Printer mom=new Printer();
    mom.brand="appleprinter";
    mom.color="yellow";
    mom.type="ink";
    mom.model=7;
    mom.tray=1;

    Printer dad=new Printer();
    dad.brand="lenova";
    dad.color="black";
    dad.type="ink";
    dad.model=12;
    dad.tray=5;

    shakh.printerInfo();
    shakh.printerBrand();
    shakh.printerColor();
    shakh.printerType();
    shakh.printerModel();
    shakh.amopuntOftray();

    shakib.printerInfo();
    shakib.printerBrand();
    shakib.printerColor();
    shakib.printerType();
    shakib.printerModel();
    shakib.amopuntOftray();

    fahmida.printerInfo();
    fahmida.printerBrand();
    fahmida.printerColor();
    fahmida.printerType();
    fahmida.printerModel();
    fahmida.amopuntOftray();

    mom.printerInfo();
    mom.printerBrand();
    mom.printerColor();
    mom.printerType();
    mom.printerModel();
    mom.amopuntOftray();

    dad.printerInfo();
    dad.printerBrand();
    dad.printerColor();
    dad.printerType();
    dad.printerModel();
    dad.amopuntOftray();



}













}
