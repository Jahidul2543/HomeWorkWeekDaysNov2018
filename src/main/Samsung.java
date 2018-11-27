package main;

public class Samsung {

    public static int samsungPrice;

    public static void setSamsungPrice(int samsungPrice){
        Samsung.samsungPrice=samsungPrice;
    }
    public static int getSamsungPrice(){
        return samsungPrice;
    }
 public static void main(String[]args){

        Samsung tv = new Samsung();
        tv.setSamsungPrice(500);
     System.out.println(" "+getSamsungPrice());


 }

}
