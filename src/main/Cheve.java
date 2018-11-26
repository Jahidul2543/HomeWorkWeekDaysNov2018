package main;

public class Cheve {
   static int number;


    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public static void main(String[]args){

        Cheve car= new Cheve();
           car.setNumber(125);
        System.out.println("This car's lot number is " +car.getNumber()+ " ");

        Cheve van= new Cheve();
        van.setNumber(120);
        System.out.println("This car's lot number is " +car.getNumber()+ " ");

        Cheve miniVan= new Cheve();
        miniVan.setNumber(130);
        System.out.println("This car's lot number is " +car.getNumber()+ " ");

        Cheve suv= new Cheve();
        suv.setNumber(121);
        System.out.println("This car's lot number is " +car.getNumber()+ " ");

        Cheve sportsCar= new Cheve();
        sportsCar.setNumber(150);
        System.out.println("This car's lot number is " +car.getNumber()+ " ");



    }

}
