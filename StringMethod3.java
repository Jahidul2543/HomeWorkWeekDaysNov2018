package HomeWorkWeekDaysNov2018;

public class StringMethod3 {

    static String name = new String ("Brk in New york");


    /*int[] name1 = {1,2,3,45,6};
    String name2 = new String(name1);
    */

    char[] name5 = {'B','r','o','o','k','l','y','n'};

    String name6 = new String (name5);
    String name7 = new String(name5,3,4);


    public static void main(String[] args) {
        System.out.println(name);
        StringMethod3 obj2 = new StringMethod3();

        System.out.println(obj2.name5);
        System.out.println(obj2.name6);
        System.out.println(obj2.name7);

    }
}
