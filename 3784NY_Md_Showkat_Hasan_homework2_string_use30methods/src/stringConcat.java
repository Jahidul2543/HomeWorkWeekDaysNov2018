public class stringConcat {


    static String name = "Java is object oriented programming language,";
    static String name1 = " because no matter it is using primitive data types but parallely it is also fullfilling all the conditions of object oriented programming. ";

    static String stringConcat = name.concat(name1);


    public static void main(String[] args) {
        System.out.println(stringConcat);

        System.out.println("Result : Here it combines name+name1");
    }


}