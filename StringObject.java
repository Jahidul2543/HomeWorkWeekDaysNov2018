package HomeWorkWeekDaysNov2018;

public class StringObject {

    static String name = "Muhammad Afnan Saeed";

    static char [] middle = {'A','f','n','a','n'};
    static String last = new String(middle,1,3);
//    Assign static value to instance variable

    String firstName = new String(middle);
    // Giving error when you trying assign instance variable value to class variable
    // where above example we assign static variable value to instance variable
    //static String convertFromInstanceToStatic = new String(firstName); this code is error
    static int y = 10;
    int z  = y;
    // static variable cannot take the value from instance variable
//    static int p = z;



    public static void main(String[] args) {
        System.out.println(last);
        System.out.println(middle);

        StringObject obj1 = new StringObject();


        System.out.println(obj1.firstName);

        //printing static vairable value through instance vairable
        System.out.println(obj1.z);
        System.out.println("Prinitng  class variable "+ y);
    }
}
