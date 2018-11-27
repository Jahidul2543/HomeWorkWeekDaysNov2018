package main;

public class Honda {

    String model;
    int price;
    int year;

    public Honda(String model, int year, int price){
        this.model=model;
        this.year=year;
        this.price=price;

    }

    public void ourCars(){
        System.out.println("Our " +model+ " is from " +year+ " and the price is " +price);
    }
 public static void main(String[]args){

        Honda civic=new Honda("Civic", 2018, 27000);
     Honda accord=new Honda("Accord", 2019, 30000);
     Honda crv=new Honda("Crv", 2018, 29000);
     Honda pilot=new Honda("Pilot", 2019, 40000);
     Honda odessey=new Honda("Odessey", 2018, 35000);

        civic.ourCars();
        accord.ourCars();
        crv.ourCars();
        pilot.ourCars();
        odessey.ourCars();
 }

}
