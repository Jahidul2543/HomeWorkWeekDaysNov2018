package HomeWorkWeekDaysNov2018;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListPractice {


// ArrayList are resizable array

     // Empty LIST

    List<String> names = new ArrayList();

 // Integer used as Wrapper Class
    List<Integer> numbers = new ArrayList<>();

    // Can also be created with class name; above i created from List interface

    ArrayList<Integer> numnber1 = new ArrayList<>();

    //initialize array while declaring
    // used method from Array class Array.aslist(values inserted)
    ArrayList<String> name1 = new ArrayList<String>(Arrays.asList("Muhammad","Afnan","Saeed"));

    //Add and remove elements
    // USE add(); set(); remove();
    public static void main(String[] args) {

        ArrayListPractice obj1 = new ArrayListPractice();

        obj1.names.add("New York");
        // ArrayList allow duplicate Values
        obj1.names.add("New York");
        obj1.names.add("Islamabad");
        obj1.names.add("Chicago");
        obj1.names.add("Vegas");
        System.out.println(obj1.names); // confirmed New york appears twice on console

        // changing index 1 to Washington

        obj1.names.set(1,"Washington ");
        obj1.names.set(2,"St. Louis");
        System.out.println(obj1.names);
        // remove vegas
        obj1.names.remove("Vegas");//remove with String
        System.out.println(obj1.names);
        obj1.names.remove(3);// removing with index number
        // remove method take String and int parameter both acceptable
        System.out.println(obj1.names);
        // Iterate. iterator() or listIterator()
        // Using Iterator class
        Iterator <String> obj1iteraor = obj1.names.iterator();
        //Using while LOOP

        while(obj1iteraor.hasNext()){
            System.out.println(">>>>> "+obj1iteraor.next());
        }
        // iterator on obj1 other properties
        System.out.println("***************");
        Iterator<String> obj1aiterator = obj1.name1.iterator();

        while(obj1aiterator.hasNext()){
            System.out.println(obj1aiterator.next());

        }

        //// ArrayList sort methods
        // using List Interface
          obj1.names.sort(Comparator.comparing(String::toString));
        System.out.println("The Alphabetical order is : " + obj1.names);
        obj1.names.sort(Comparator.comparing(String::toString).reversed());
        System.out.println("The reverse order is : "+obj1.names);
         // using Collections Class
            // Natural Order>>>>The C is capital and s  to be noted here
            Collections.sort(obj1.name1);
        System.out.println(obj1.name1);
        // reverse order
        Collections.sort(obj1.name1,Collections.reverseOrder());
        System.out.println(obj1.name1); // reversing the order

        // inserting numbers in numbers Arraylist and numbers1
        // using For loop
        for(int i =1; i <=10; i++){
            obj1.numbers.add(i);
        }

        System.out.println(obj1.numbers);

        for (int j = 20; j>=10; j--){
            obj1.numnber1.add(j);
        }

        System.out.println(obj1.numnber1);
        // sorting in int ArrayList
        obj1.numnber1.sort(Comparator.comparing(Integer::valueOf)); //using reverse in the end when using List interface
        System.out.println();
        System.out.println("prinitng natural Order : "+ obj1.numnber1);
        // Using Collections Class for reverse Integer ArrayList
        Collections.sort(obj1.numbers,Collections.reverseOrder());
        System.out.println("Printing Reverse Order: "+obj1.numbers);
        //  using addall() method
        obj1.numnber1.addAll(obj1.numbers);
        obj1.numbers.addAll(5,obj1.numnber1);
        System.out.println(obj1.numnber1);
        System.out.println(obj1.numbers);
        // Using Contain method

        System.out.println(obj1.numbers.contains(3));
        System.out.println(obj1.name1.contains("AfnAn"));
        // get() method used to get display value at provided index
        System.out.println(obj1.numnber1.get(10));
        System.out.println(obj1.name1.get(2));
        //indexOf value confirms value is in the list or not
        System.out.println(obj1.numnber1.indexOf(34));
        System.out.println(obj1.names.indexOf("St. Louis")); // return 1 for available element and -1 not found
        // last indexof
        System.out.println(obj1.numnber1.lastIndexOf(10));
        System.out.println(obj1.numnber1.lastIndexOf(1));
        System.out.println(obj1.name1.lastIndexOf("Saeed"));
        //list Iterator
        ListIterator <String> obj1namesIter = obj1.names.listIterator();

        while (obj1namesIter.hasNext()){
            System.out.println(obj1namesIter.next());
        }
        System.out.println("********Reverse Order************");
        while(obj1namesIter.hasPrevious()){
            System.out.println(obj1namesIter.previous());

        }

        // for Integer Stirng
        ListIterator<Integer> obj1numbersIter = obj1.numbers.listIterator();
        while(obj1numbersIter.hasNext()){

            System.out.println(obj1numbersIter.next());
        }
        // remove method using singleton method
        obj1.numbers.removeAll(Collections.singleton(20));
        System.out.println(obj1.numbers.indexOf(20));
        // retainAll() only maintain the specified elements for the Array.



    }




























    }




