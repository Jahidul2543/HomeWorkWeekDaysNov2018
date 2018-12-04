package HomeWorkWeekDaysNov2018;
import java.util.ArrayList;
public class FrameArrayList {

    public static void main(String[] args) {
        //static Array
        // size is fixed

        int [] arra = {1,2,3,4}; // size is fixed


        //Dynamic Array >>>>>ArrayList
        //1. Contain Duplicate Values
        //2. maintain insertion order
        //3. Synchronized slow compared to other collections
        //4. Allows random access to fetch Elements
        ArrayList ar = new ArrayList();
        ArrayList ar1;
        ar1= new ArrayList();
        // Storing Different data types in an array
        ar.add("Afnan");
        ar.add(3);
        ar.add(true);
        ar.add(23.4);
        ar.add('u');
        System.out.println(ar.get(0));// using index number to get value
        System.out.println(ar.size());//
        System.out.println(ar.get(4));
        ar.add("Saeed");
        ar.add(50);
        System.out.println(ar.get(6));
        System.out.println(ar.size());
        ar1.addAll(ar);// added ar in ar1 by using builtin method
        System.out.println("The Size of ar1 is " + ar1.size());
        System.out.println(ar1.get(4));
        //printing ArrayList all values using For Loop
        for(int i =0; i < ar1.size();i++){
            System.out.println(ar1.get(i));

        }
        // using for each loop on static array
        for(int i: arra){
            System.out.println(i);
        }

        // non generics vs generics
        // making ArrayList using Wrapper Class!!

        ArrayList<Integer> ar3 = new ArrayList<Integer>();

        // Adding inner values using for loop multiple by 2
        for (int i = 1; i <10; i++){

            ar3.add(i*2);
        }
        // remove item by index number
        ar3.remove(6);
        // printing item using for each loop
        for(int i: ar3){
            System.out.println(i);
        }
        // multiplying items in ar3 ny 3 by using for each loop

        for(int y : ar3){
            System.out.println(y*3);
        }

        ar.set(3,134567890);
        System.out.println(ar.get(3));








    }


}
