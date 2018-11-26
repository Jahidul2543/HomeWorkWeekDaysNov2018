package basic;

import java.util.Scanner;

public class CompareThreeNumberForSum extends TwoNumberInput {

    public static void main(String[] args) {
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter the number to compare sum of Next two number");
        int z = obj2.nextInt();

        TwoNumberInput obj1 = new TwoNumberInput();

        obj1.add();
         if(obj1.y+obj1.x == z){
             System.out.print("true");
         }else{
             System.out.println("false");
         }


    }
}
