package main;

public class Dodge {

    String name;
    int id;



    public void idInfo() {

    System.out.println( "My Id is " + id + " My name is " +name);
}
public static void main(String[]args){
        Dodge s2 = new Dodge();
        s2.id=12;
        s2.name= "Sadi";

        Dodge s3 = new Dodge();
        s3.id=13;
        s3.name= "Arnob";

        Dodge s4 = new Dodge();
        s4.id=14;
        s4.name= "Seikh";

        Dodge s5 = new Dodge();
        s5.id=15;
        s5.name= "Opi";

    s2.idInfo();
    s3.idInfo();
    s4.idInfo();
    s5.idInfo();




    }


}
