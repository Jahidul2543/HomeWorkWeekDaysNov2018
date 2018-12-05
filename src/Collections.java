import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList <String>();
        ArrayList list2=new ArrayList();

        //List 1 can only accept String data
        list1.add("Ziyad"); //0
        list1.add("Hamad"); //1
        list1.add("Shahzad");//2
        list1.add("Shahzad"); // we can have duplicates

        System.out.println(list1);
      //  list1.add(123) // error, because we specify "data type".
        list1.add("Shauakt");

        //List 2 can acccept any data type

        list2.add("John"); // String
        list2.add(123); //integer
        list2.add(4.34); //float
        list2.add('C');
        System.out.println(list2);

        // Getting data from the list
        System.out.println( list1.get(2)); //

    }
}
