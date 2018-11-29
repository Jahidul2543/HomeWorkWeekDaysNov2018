

public class Apple {

    int name;
    int capacity;
    String model;

    public Apple(int name, int capacity, String model){
        this.name=name;
        this.capacity=capacity;
        this.model=model;

    }

    public void myDevice(){
        System.out.println("My phone's Name is Iphone "+name+ ", "+ " capacity is "+capacity+" gb, " + " Model is  "+model);
    }
    public static void main(String[]args){

        Apple iPhone = new Apple(10,256,"10");
        Apple iPhone2 = new Apple(8,128,"8");
        Apple iphone3 = new Apple(7,64,"7");
        Apple iphone4 = new Apple(6,32,"6");
        Apple iphone5 = new Apple(5,32,"5");

        iPhone.myDevice();
        iPhone2.myDevice();
        iphone3.myDevice();
        iphone4.myDevice();
        iphone5.myDevice();
    }

}
