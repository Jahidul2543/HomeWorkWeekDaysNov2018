package HomeWorkWeekDaysNov2018;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {


    // passing static array as a argument data type int & used for each loop
    public static void arrayFunction(int[] array){

        for(int i : array){
            System.out.println(i);
        }

    }

    // passing String array as argument in method
    public static void arrayFunction(String [] array){

        for(String i : array){
            System.out.println(i);
        }

    }

    public static void main(String[] args) {

    //  0 1 2 3 4 5
    // [0,3,5,6,7,8]

    // ["bob","mick","sam","chris"]---->>> length is 3 no change in length later

        // declaring, allocating and initializing Arrays
        int [] intArray1;
        int [] intArray2 = new int[4];
        int [] intArray3 = {1,4,3,2,5};

        String [] shoppingList = {"apples", "bananas","pears","oranges"};

        intArray2[0] = 3;
        intArray2[1] = 4;
        intArray2[2] = 5;
        intArray2[3] = 6;


        // print out Arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(shoppingList));
        System.out.println(Arrays.toString(intArray2));
      // printing array index using for loop in method passing array argument
      arrayFunction(intArray3);
      arrayFunction(shoppingList);
        // Arrays function
        // rearranging array
        Arrays.sort(intArray3);

        arrayFunction(intArray3);

    }
}
