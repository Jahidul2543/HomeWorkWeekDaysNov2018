package Homework.Homework1;

public class MathOperators {

    int x= 10;
    int y=20;


    public void multiplication(){

        System.out.println(x*y );

    }

    public void addition(){
        System.out.println(x+y);

    }

    public void subtration(){
        System.out.println(y-x);
    }

    public static void main(String[] args) {
        MathOperators obj1=new MathOperators();
        obj1.multiplication();
        obj1.addition();
        obj1.subtration();
    }
}
