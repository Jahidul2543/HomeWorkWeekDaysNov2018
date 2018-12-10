package com.trainingdays;

abstract class AbstarctClass {

    abstract void eat();
}

 class Animal extends AbstarctClass{


     @Override
     void eat() {
         System.out.println("Animal is eating");
     }


 }

 class Dog extends AbstarctClass{

     @Override
     void eat() {
         System.out.println("Dog is eating");
     }

     public static void main(String[] args) {
         AbstarctClass a = new Animal();
         AbstarctClass d = new Dog();
         a.eat();
         d.eat();
     }
 }
