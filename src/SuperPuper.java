package com.trainingdays;

public class SuperPuper {
    String  name;
    String lname;
    int number;

    SuperPuper(String name,String lname,int number){
        this.name = name;
        this.lname = lname;
        this.number = number;
    }
    public void speak(){
        System.out.println(name+lname+number);
    }


}


class SubPuper extends SuperPuper{

    public void speak(){
        System.out.println(name+lname+number+salary);
    }


    int salary;
    SubPuper(String name,String lname,int number,int salary){
        super(name,lname,number);
        this.salary = salary;

    }

    public static void main(String[] args) {
        SubPuper obj1 = new SubPuper("rot","lot",4,2000);
        SuperPuper obj = new SuperPuper("loop","joh",5);
        obj1.speak();
        obj.speak();
    }
}
