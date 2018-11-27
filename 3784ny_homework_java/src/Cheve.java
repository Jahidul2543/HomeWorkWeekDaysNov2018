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
        car.setNumber(101);
        System.out.println("Cheve Seden's lot number is " +car.getNumber()+ " ");

        Cheve van= new Cheve();
        van.setNumber(102);
        System.out.println("Cheve Van's lot number is " +car.getNumber()+ " ");

        Cheve miniVan= new Cheve();
        miniVan.setNumber(103);
        System.out.println("Cheve Minivan's lot number is " +car.getNumber()+ " ");

        Cheve suv= new Cheve();
        suv.setNumber(104);
        System.out.println("Cheve Suv's lot number is " +car.getNumber()+ " ");

        Cheve sportsCar= new Cheve();
        sportsCar.setNumber(105);
        System.out.println("Cheve Sports car's lot number is " +car.getNumber()+ " ");



    }

}
