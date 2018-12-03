package Homework.HomeWork2;

public class StringMethods {
    public static void main(String[] args) {
    //1    // String CharAt example
        String name = "Ziyad";
        String s1 = "Hello";
        String s2 = "Java";
        char ch = name.charAt(3);
        System.out.println(ch);

    //2    //String CompareTo example

        System.out.println(s1.compareTo(s2));

    //3 String Concat example

        String str3 = s1.concat(s2);
        System.out.println(str3);

     //4 String Contains example

        String str = "Hi my name is Ziyad";
        if(str.contains("my name")) {
            System.out.println("This string contains my name");
        }else
            System.out.println("No Result");

     //5 String endWith example

        String str5 = "This is String method example";
        System.out.println(str5.endsWith("example"));
        if(str5.endsWith("method")) {
            System.out.println("String ends with method");
        }else System.out.println("It does not end with method");

     // String equals example

        String st1="hello";
        String st2="hello";
        String st3="welcome";
        String st4="Java";

        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));
        System.out.println(st1.equals(st4));

     // String


    }

}