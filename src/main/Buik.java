package main;

public class Buik {
  static  int buikModel;

    public void setBuikModel(int buikModel) {
        this.buikModel = buikModel;
    }

    public int getBuikModel() {

        return buikModel;
    }

    //public void model() {
        //System.out.println("These are the buik models we have.");

   // }
    public static void main(String[]args){

        Buik car= new Buik();
        car.setBuikModel(2019);
        System.out.println("this is " + car.getBuikModel() + " model car");
        Buik sedan= new Buik();
        sedan.setBuikModel(2019);
        System.out.println("this is " + car.getBuikModel()+ " model car");
        Buik van= new Buik();
        van.setBuikModel(2017);
        System.out.println("this is " + car.getBuikModel()+ " model car");
        Buik miniVAn= new Buik();
        miniVAn.setBuikModel(2016);
        System.out.println("this is " + car.getBuikModel()+ " model car");
        Buik scooty= new Buik();
        scooty.setBuikModel(2018);
        System.out.println("this is " + car.getBuikModel()+ " model car");
        Buik truck= new Buik();
        truck.setBuikModel(2020);
        System.out.println("this is " + car.getBuikModel()+ " model car");

    }
}
