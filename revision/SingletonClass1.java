package HomeWorkWeekDaysNov2018.revision;

public class SingletonClass1 {
    // there are three steps involve in making a singleton class
    // singleton is a concept in java that one class has one instance
    // we restrict class to have one instance only
    /*
     *
     * NEED TO UNDERSTAND THIS MORE ITS NOT MAKING SENSE
     *
     *
     * */

    static SingletonClass1 obj1 = new SingletonClass1();

    // make constructor private so noone can access outside class





    private SingletonClass1(){

    }
    // returning obj type with this method

    public static SingletonClass1 getSingletonClassObj1(){

        return obj1;
    }

    int y = 1000;
    int r = y - 500;

    public void display45(){
        System.out.println("The answer is");
    }
    public void result12(){
        display45();
        System.out.println(r);

    }

    public static void main(String[] args) {


        SingletonClass1 obj1 = new SingletonClass1();

        SingletonClass1 obj2 = new SingletonClass1();

        obj1.result12();

    }

}
