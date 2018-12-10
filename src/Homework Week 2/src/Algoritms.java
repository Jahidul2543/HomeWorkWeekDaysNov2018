import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.text.CollationKey;
import java.text.Collator;
import java.util.*;

public class Algoritms {


//
    static String[] names = {"Bob","Cindy","Dmitriy","Alex","Alaex"};

    static LinkedList<Integer> numbers = new LinkedList<>();
    static LinkedList<String> Names = new LinkedList<>();

//    static HashMap<Integer,String> DoubleArray = new HashMap<>();

    static Hashtable<Integer,String> DoubleArray = new Hashtable<>();

    static ArrayList<Integer> anyList = new ArrayList<Integer>();


    public static void main(String[] args) {
//
//        Arrays.sort(names);
//
//        for (int i = 0; i <names.length ; i++) {
//            System.out.println(names[i]);
//

//        }
                anyList.add(12);
                 anyList.add(3);
               anyList.add(5);
              anyList.add(1);
               anyList.sort(Integer::compareTo);
        System.out.println(anyList);
//





        numbers.add(5);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);
        numbers.add(2);
        numbers.add(21);
        numbers.add(101);
        numbers.add(15);

        numbers.sort(Integer::compareTo);
        System.out.println(numbers);

//        Names.add("Alex");
//        Names.add("Bob");
//        Names.add("Coleh");
//        Names.add("Dmitriy");
//        Names.add("Maya");
//
//        Collections.sort(Names, new Comparator<String>() {
//            @Override
//            public int compare(String a1, String b2) {
//                return b2.length() - b2.length();
//            }
//
//        });
//
//        System.out.println(Names);


        DoubleArray.put(5,"Maya");
        DoubleArray.put(3,"Cindy");
        DoubleArray.put(4,"Dima");
        DoubleArray.put(2,"Bob");
        DoubleArray.put(1,"Alex");







        }




    }

