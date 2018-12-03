




public class Samsung2 {

    public static int samsungPrice;

    public static void setsamsungPrice(int samsungPrice){
        Samsung2.samsungPrice=samsungPrice;
    }
    public static int getsamsungPrice(){
        return samsungPrice;
    }
    public static void main(String[]args){

        Samsung2 tv = new Samsung2();
        tv.setsamsungPrice(500);
        System.out.println(" Samsung Tv Price is "+getsamsungPrice());


    }

}


