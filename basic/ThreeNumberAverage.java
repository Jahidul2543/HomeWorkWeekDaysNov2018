package basic;

import java.util.Scanner;

public class ThreeNumberAverage extends TwoNumberInput {

    public static void main(String[] args) {
        ThreeNumberAverage obj1 = new ThreeNumberAverage();
        // use from parent class below method to get first two input
        obj1.TwoNumberInput();
        //Third number input take in this program
        System.out.println("Enter Third Number");
        Scanner obj2 = new Scanner(System.in);
        int z = obj2.nextInt();
        //result
        System.out.println("The result is : "+(obj1.x+obj1.y+z)/3);

    }

}
