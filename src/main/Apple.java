package main;

public class Apple {

int version;
int capacity;
String model;

public Apple(int version, int capacity, String model){
    this.version=version;
    this.capacity=capacity;
    this.model=model;

}

 public void myDevice(){
     System.out.println("My phone's verion "+version+" capacity "+capacity+" gb " +model);
 }
 public static void main(String[]args){

    Apple iPhone = new Apple(7,64,"iphone");
    Apple iPhone2 = new Apple(8,128,"iPhone");
    Apple iphone3 = new Apple(10,256,"iPhone");

    iPhone.myDevice();
    iPhone2.myDevice();
    iphone3.myDevice();
}

}
