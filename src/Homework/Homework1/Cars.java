package Homework.Homework1;

public class Cars {
    String nameOfCar;
    String modelOfCar;
    int yearOfCar;

    public void iLoveMyCar(){
        System.out.println("I love my " + nameOfCar+ " and the model of my car is " +modelOfCar+ " which was made in " +yearOfCar);

    }

    public Cars(String nameOfCar,String modelOfCar,int yearOfCar){
        this.nameOfCar= nameOfCar;
        this.modelOfCar=modelOfCar;
        this.yearOfCar=yearOfCar;
    }

    public static void main(String[] args) {
        Cars myCar= new Cars("Nissan","Altima",2016);
        myCar.iLoveMyCar();
    }
}

