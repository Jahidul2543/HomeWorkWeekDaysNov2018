package Classes_Objects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.function.Consumer;

public class SortArray {

    static int[] numbers = {1,5,-2,-4,7};

    static String name = "i want to capitalize all string in the sentence";
//    static String[] toSplit = name.split(" ");
//    static String newString = "";

//    static String[] array =  {"ruslan","afnan","ziyad","baris","cindy","ruslan"};
    static ArrayList<String> list = new ArrayList<>(Arrays.asList("ruslan","afnan","ziyad","baris","cindy","ruslan"));
//    static Hashtable<Integer,String> hashbay = new Hashtable<>();


    public static void main(String[] args) {

        numbers = Arrays.stream(numbers).filter(x->x>0).toArray();

        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);

        }







////
//        Consumer<String> lambdaExpression = x -> System.out.println(x.substring(0,1).toUpperCase() + x.substring(1));
//
//
//        list.forEach(lambdaExpression);
//






//        for (int i = 0; i < toSplit.length ; i++) {
//
//            newString+=toSplit[i].substring(0,1).toUpperCase() + toSplit[i].substring(1);
//
//
//
//        }
//        System.out.println(newString);
//

//        for (int i = 0; i <array.length ; i++) {
//            System.out.println(array[i]);
//
//        }
//        Arrays.sort(array);
//



            //        list.sort(String::compareTo);
//        System.out.println(list);

    }
}
