package main;

public class Lamborghini {

    public static int carPrice;

   public static void setCarPrice(int carPrice) {
        Lamborghini.carPrice = carPrice;
    }

    public static int getCarPrice() {
    return carPrice;
    }
 public static void main(String[]args){

 Lamborghini huracane = new Lamborghini();
 huracane.setCarPrice(1000000);
     System.out.println("My huracan is "+getCarPrice());

     Lamborghini sport = new Lamborghini();
     sport.setCarPrice(300000);
     System.out.println("My huracan is "+getCarPrice());

     Lamborghini italy = new Lamborghini();
     italy.setCarPrice(305000);
     System.out.println("My huracan is "+getCarPrice());




    }

}
