import com.sun.javafx.collections.ArrayListenerHelper;
import com.sun.org.apache.xerces.internal.xs.StringList;
import sun.management.Agent;

import java.util.*;

public class Main {

        //    Strings that i will be using for String Methods
        static  String introToStringMethods  = "Hello my name is Ruslan";
        static String IntroToStringMethods2 = " I'm learning to code in Java.";
        static String forTrim = "   I had space around me              ";
        static int AgentToString = 227;
        static String AgentToInteger = "227";
        static String EmptyString ="";


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    // toUpperCase will allow me to Capitalize all characters in the String
    static String toUpperCase = introToStringMethods.toUpperCase();

    // TolowerCase will male all chars in lowerCase
    static String toLowerCase = introToStringMethods.toLowerCase();


   //    Last index of String
   static int lastIndex = introToStringMethods.lastIndexOf('a');

   //   Will find first index of String
   static int firstIndex = introToStringMethods.indexOf('a');
//    Will look for char fromIndex that was given
    static int Index = introToStringMethods.indexOf('a',15);

   //   Will cut index of String that we specify first is start , second is end;
   static  String SubString = introToStringMethods.substring(0,1);

   //   Will concatenate two strings
   static  String Concat = introToStringMethods.concat(IntroToStringMethods2);

   //  Compare to Substring with start and end This Method has only one parametr , this parametr the end of the slice and rest will print out.
   static  String Slice = introToStringMethods.substring(5);

    //        Replace first subStr of String
    static String ReaplaceFirst = introToStringMethods.replaceFirst("Hello","Hey");

   //   Will replace old String or char into New that you will specify.
   static String  Replace = introToStringMethods.replace("Ruslan","Ruslan Agaev");

   //   Remove space around String
   static  String Trim = forTrim.trim();

   //   Will cut the char that was specified by index.
   static  char char4ik = introToStringMethods.charAt(4);

   //   Start with methods will return true or false based on condition if string start with our giving parametr than it will return true
    static boolean StartWith = introToStringMethods.startsWith("Hello");

    //  Boolean type will return True if string ends with specified ending that we gave as parametr.
   static boolean endWithChar = introToStringMethods.endsWith("lan");


    //   Boolean type will return True if contain chars or string
   static boolean Contain = introToStringMethods.contains("Rus");

    //   Comparing to another string with attention to Capitalization
    static boolean Comparing = introToStringMethods.equals("hello my name is ruslan");


    // Will ignore the case . Methods won't care about Capitalization.
   static boolean EqualsTo = introToStringMethods.equalsIgnoreCase("hello my name is ruslan");

   //   Will return Length of the String
   static int returnLengthofString = introToStringMethods.length();

   //  Splits this string around matches
   static String[] toSplit = introToStringMethods.split("ll");

   //Converted Integer to String
   static String toString = Integer.toString(AgentToString);

   //   Convert String into Integer
   static int toInteger = Integer.parseInt(AgentToInteger);
    //Check if the String is empty
    static boolean emptyorNot = EmptyString.isEmpty();

    //   Check if matching it matching return true
    static boolean toMatch = introToStringMethods.matches(forTrim);

    //       Return Array of Chars
    static char[] charOfARray = introToStringMethods.toCharArray();

    //       Return code of char that we specify
    static int CharIndexes = introToStringMethods.codePointAt(2);

    //    Get byte of String
    static byte[] GetByte = introToStringMethods.getBytes();

    //       Return HashCode of String
    static int hashBash = introToStringMethods.hashCode();

    //Returns a canonical representation for the string object.
    static String Inter = introToStringMethods.intern();
    //    Return whole Replaced String

        static String ReplaceALl = introToStringMethods.replaceAll(introToStringMethods,forTrim);
    // Return boolean true if "my" start from index 6
        static boolean CheckTheStartOfSpecifiedChar = introToStringMethods.startsWith("my",6);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//                     Arralist ,Hashtable

    static String[] ArrayofNames = {"Ruslan","Max","Soxa","Ralan","Zar","Vladik","Holyor"};


                            // LinkedList

    static List<String> Names = new LinkedList<String>();

                            //    Hashmap

    static HashMap<String,Integer> listOfStringAndIntegers = new HashMap<>();

                            //   Tree set

    static TreeSet<String>TreeSetOfStrings = new TreeSet<>();


                        // HashTable

    static Hashtable<String,String> classMates = new Hashtable<>();






    public static void main(String[] args) {

//////////////For String Methods////////////////////////////////

        System.out.println(introToStringMethods);
        System.out.println(toUpperCase);
        System.out.println(toLowerCase);
        System.out.println(lastIndex);
        System.out.println(firstIndex);
        System.out.println(SubString);
        System.out.println(Concat);
        System.out.println(Slice);
        System.out.println(Replace);
        System.out.println(Trim);
        System.out.println(char4ik);
        System.out.println(endWithChar);
        System.out.println(Contain);
        System.out.println(Comparing);
        System.out.println(EqualsTo);
        System.out.println();
        System.out.println(returnLengthofString);
        System.out.println(StartWith);
        for (int i = 0;i<toSplit.length;i++){
            System.out.println(toSplit[i]);
        }
        System.out.println(toString);
        System.out.println(toInteger);
        System.out.println(emptyorNot);
        System.out.println(toMatch);

        for(char tempCharArray:charOfARray){
            System.out.println(tempCharArray);
        }
        System.out.println(CharIndexes);
        System.out.println(Inter);
        System.out.println(ReplaceALl);
        System.out.println(Index);
        System.out.println(GetByte);
        System.out.println(CheckTheStartOfSpecifiedChar);
        System.out.println(ReaplaceFirst);

///////////////////For Arrays/////////////////////////////////

            for (String Items:ArrayofNames){
                System.out.println(Items);
            }

    //           Adding to Array
            Names.add("Alex");
            Names.add("Robert");
            Names.add("Julia");
            Names.add("Maya");
            Names.add("Diana");
            Names.add("Kate");
            Names.add("Lilia");
    //         Removing Julia from Array
            Names.remove("Julia");
            Names.remove("Alex");



    //         Print whole list
            System.out.println(Names);
    //        For Each for names tree set

            for(String NamesBox: Names){
                System.out.println(NamesBox);
            }

    //        Hashmap Adding string and integers

            listOfStringAndIntegers.put("Ruslan",8);
            listOfStringAndIntegers.put("Alex",21);
            listOfStringAndIntegers.put("Ziyad",6);
            listOfStringAndIntegers.put("Latif",12);


                      //        Remove from HashMap

            listOfStringAndIntegers.remove("Alex",21);

//            Get from HashMap
        System.out.println(listOfStringAndIntegers.get("Ruslan"));

                             //Print Hashmap
            System.out.println(listOfStringAndIntegers);


            System.out.println(listOfStringAndIntegers.keySet());

            for (String HashKeys:listOfStringAndIntegers.keySet()){
                System.out.println(HashKeys);
            }
            for (int HashValues:listOfStringAndIntegers.values()){

                System.out.println(HashValues);
            }


    //            Add to Tree set . Tree set can't add duplicate values

            TreeSetOfStrings.add("November");
            TreeSetOfStrings.add("December");
            TreeSetOfStrings.add("January");
            TreeSetOfStrings.add("February");
            TreeSetOfStrings.add("November");        //Will ignore Duplicate November and print only once

    //        Remove from Tree set

            TreeSetOfStrings.remove("February");


    //         Print Tree set

            System.out.println(TreeSetOfStrings);

    //   HashTable put into table


            classMates.put("one","Ziyad");
            classMates.put("two","Hasan");
            classMates.put("tree","Afnan");
            classMates.put("four","Alber");
            classMates.put("one","Ziyad");
            classMates.put("five","Jake");

//            Remove from HashTable
        classMates.remove("five","Jake");

    //HashTable print without duplicate
            System.out.println(classMates.values());
            System.out.println(classMates.keySet());








        }
}
