package main;

public class Nissan {
 public static int nissanLot;

 public static void setNissanLot(int nissanLot){
      Nissan.nissanLot=nissanLot;
  }
  public static int getNissanLot() {
        return nissanLot;
    }

    public static void main(String[]args){

    Nissan altima= new Nissan();
    altima.setNissanLot(50);
        System.out.println("we have "+getNissanLot()+ " Nissan Altima cars");

        Nissan maxima= new Nissan();
        maxima.setNissanLot(60);
        System.out.println("we have "+getNissanLot()+ " Nissan Maxima cars");

        Nissan murano= new Nissan();
        murano.setNissanLot(50);
        System.out.println("we have "+getNissanLot()+ " Nissan Murano cars");


 }
}
