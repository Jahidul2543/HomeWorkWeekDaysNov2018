package Homework.Homework1;

public class Cat extends Animals{
    public Cat(String name, String breed, int numberOfLegs) {
        super(name, breed, numberOfLegs);

        }

        public void catsMeow(){
            System.out.println("Hi i am " + name);
    }

    public static void main(String[] args) {
        Cat myCat=new Cat("Timmy", "Tiger", 4);
        myCat.catsMeow();
    }
    }





