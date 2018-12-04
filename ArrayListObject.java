package HomeWorkWeekDaysNov2018;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListObject {

    public static void main(String[] args) {
        // making object using SrringCompare Class

        StringCompare obj1 = new StringCompare("Afnan",34,"QA");
        // making more objects to store in ArrayList
        StringCompare obj2 = new StringCompare("Sunny", 35,"Marketing");
        StringCompare obj3 = new StringCompare("Ali", 42, "Accounts");
        // ArrayList with StringCompare objects;

        ArrayList<StringCompare> ar35 = new ArrayList<StringCompare>();
        // Storing Objects in ArrayList

        ar35.add(obj1);
        ar35.add(obj2);
        ar35.add(obj1);// Storing two same objects
        ar35.add(obj3);

        // iterator to traverse the value
            Iterator<StringCompare> detail = ar35.iterator();
            // ??????????????????
            while(detail.hasNext()){
                StringCompare emp = detail.next();
                System.out.println(emp.name);
                System.out.println(emp.age);
                System.out.println(emp.dept);
            }

        }



    }




