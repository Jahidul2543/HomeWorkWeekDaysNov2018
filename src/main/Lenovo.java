package main;

public class Lenovo {



     int price;
    int make;

public Lenovo(int price,int make){
    this.price=price;
    this.make=make;
}
public void lenovoInfo(){
    System.out.println("Lenovo price " +price+ " make "+make);
}
public static void main(String[]args){

    Lenovo tab = new Lenovo(300,2014);
    Lenovo laptop= new Lenovo(1200,2018);
    Lenovo phone = new Lenovo(500,2018);
    Lenovo  tv= new Lenovo(600,2016);

    tab.lenovoInfo();
    laptop.lenovoInfo();
    phone.lenovoInfo();
    tv.lenovoInfo();
}


}
