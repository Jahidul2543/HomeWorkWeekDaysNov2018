package Homework;

public class Constructors {

    String name;
    int age;

    public Constructors(String name, int age) {
        System.out.println("Print " + name + "Also print " + age);
        this.name=name;
        this.age=age;

    }
    public void add(){
        System.out.println(name+age);

    }

    public static void main(String[] args) {
        Constructors cons1=new Constructors("john",18);
        cons1.add();
    }
}