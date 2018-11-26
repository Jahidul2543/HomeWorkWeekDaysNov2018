package basic;

import java.util.Scanner;

public class TwoNumberInput extends  MultiplicationTable{
    protected int x,y;
    public void TwoNumberInput() {

        Scanner twoNumbers = new Scanner(System.in);
        System.out.println("Enter First Number");
        this.x = twoNumbers.nextInt();
        System.out.println("Enter Second Number");
        this.y= twoNumbers.nextInt();

    }

    public void basicOperation(){
        this.add();
        this.subtract();
        this.multiply();
        this.divide();
        this.modulus();

    }
    public void add(){
        System.out.println("Adding two Numbers");
        this.TwoNumberInput();
        System.out.printf("The result is %d + %d = %d\n",this.x,this.y,this.x+this.y);
    }
    public void subtract(){
        System.out.println("Subtract two Numbers");
        this.TwoNumberInput();
        System.out.printf("The result is %d - %d = %d\n",this.x,this.y,this.x-this.y);
    }

    public void multiply(){
        System.out.println("multiply two Numbers");
        this.TwoNumberInput();
        System.out.printf("The result is %d x %d = %d\n",this.x,this.y,this.x*this.y);

    }
    public void divide(){
        System.out.println("Divide two Numbers");
        this.TwoNumberInput();
        System.out.printf("The result is %d / %d = %d\n",this.x,this.y,this.x/this.y);

    }
    public void modulus(){
        System.out.println("Check modulus of two numbers");
        this.TwoNumberInput();
        System.out.printf("The result is %d %% %d = %d\n",this.x,this.y,this.x%this.y);
    }

    public static void main(String[] args) {

        TwoNumberInput obj1 = new TwoNumberInput();
/*
        obj1.add();
        obj1.subtract();
        obj1.multiply();
        obj1.divide();
        obj1.modulus();
    */
        // One function to perform five math operations
//        obj1.basicOperation();

        TwoNumberInput obj2 = new TwoNumberInput();

        obj2.add();

        obj1.MultiplicationTable();

    }

















}
