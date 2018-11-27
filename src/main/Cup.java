package main;

public class Cup {
    int numberofcup;
    String name;

    public void cupInfo(){
        System.out.println("the name of the cup "+name+" the number of cup"+numberofcup);
    }
    public void bottle(){
        System.out.println("the name of the bottle"+name);
    }

    public static void main(String[]args){
        Cup dd=new Cup();
        dd.numberofcup=10;
        dd.name="dunkin donut";

        Cup ad=new Cup();
        ad.numberofcup=5;
        ad.name="starbucks";

        dd.cupInfo();
        dd.bottle();

        ad.cupInfo();
        ad.bottle();

    }






}
