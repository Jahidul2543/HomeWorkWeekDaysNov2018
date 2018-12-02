package test;

public class TestConstructor {
    int price;
    int amount;


    public TestConstructor(){}
    public TestConstructor(int price, int amount){}
    public TestConstructor(int price){}
    public static void main(String[] args) {

        TestConstructor apple =new TestConstructor(800,900);
        TestConstructor samsung= new TestConstructor(900);




    }



}
