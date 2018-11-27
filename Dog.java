package main;

public class Dog {



    int age;
    String name;
    static int numberOflegs = 4;
    public void about ( int a, String name){

        int nextYear = a +1;

        System.out.println (name + " is " + age + ".");
        System.out.println ("All dogs have" + numberOflegs + "legs.");
        System.out.println ("next year , this dog will be " + nextYear + "years old.");


    }
        public static void main (String [] args)

        Dog Tom = new Dog();
        Tom.age = 2;
        Tom.name + "TOM";




    }
}
