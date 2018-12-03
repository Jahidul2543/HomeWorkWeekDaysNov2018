package main;

public class Iphone {

    int id;
    int price;
    String storeName;
    String phoneName;

    public void Phoneinfo(){
        System.out.println(" Phone Id :  " + id +", Phone Name: " + phoneName +"," + " Price: " + price + " Store: " + storeName );
    }

    public static void main(String[]args){

        Iphone Iphonexr = new Iphone();
        Iphonexr.id=001;
        Iphonexr.phoneName = "Iphonexr";
        Iphonexr.price=749;
        Iphonexr.storeName="Brookline";

        Iphone Iphonex = new Iphone();
        Iphonex.id=002;
        Iphonex.phoneName = "Iphonex";
        Iphonex.price=999;
        Iphonex.storeName="Manhattan";

        Iphone Iphonexmax = new Iphone();
        Iphonexmax.id=003;
        Iphonexmax.phoneName = "Iphonexmax";
        Iphonexmax.price=1099;
        Iphonexmax.storeName="Queens";

        Iphone Iphone8plus = new Iphone();
        Iphone8plus.id=004;
        Iphone8plus.phoneName = "Iphone8plus";
        Iphone8plus.price=599;
        Iphone8plus.storeName="Bronx";

        Iphone Iphone7plus = new Iphone();
        Iphone7plus.id=005;
        Iphone7plus.phoneName = "Iphone7plus";
        Iphone7plus.price=499;
        Iphone7plus.storeName="Long Island";

        Iphonexr.Phoneinfo();
        Iphonex.Phoneinfo();
        Iphonexmax.Phoneinfo();
        Iphone8plus.Phoneinfo();
        Iphone7plus.Phoneinfo();


    }

}