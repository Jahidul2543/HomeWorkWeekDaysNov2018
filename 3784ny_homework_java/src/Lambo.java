package main;

public class Lambo {

    String name;
    int id;



    public void idInfo() {

        System.out.println( "Driver Id is " + id + " & name is " +name);
    }
    public static void main(String[]args){
        Lambo A1 = new Lambo();
        A1.id=12;
        A1.name= "Jone";

        Lambo A2 = new Lambo();
        A2.id=13;
        A2.name= "Steve";

        Lambo A3 = new Lambo();
        A3.id=14;
        A3.name= "Harry";

        Lambo A4 = new Lambo();
        A4.id=14;
        A4.name= "Jorge";

        Lambo A5 = new Lambo();
        A5.id=15;
        A5.name= "Adward";

        A1.idInfo();
        A2.idInfo();
        A3.idInfo();
        A3.idInfo();
        A5.idInfo();




    }


}
