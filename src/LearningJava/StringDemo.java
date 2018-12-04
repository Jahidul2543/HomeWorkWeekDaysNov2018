package LearningJava;

public class StringDemo {

    public static void main(String[] args) {

        String s = "study so that you can learn ";
        String s1= "tiger";


        System.out.println(s.charAt(3));

        System.out.println(s.length());



        System.out.println(s.codePointAt(2));



        System.out.println(s.codePointBefore(8));


        System.out.println(s.codePointCount(4,15));


        char [] charArray =new char[10];
        s.getChars(1,5,charArray ,1);
        System.out.println(charArray);


        System.out.println(s.getBytes());


        if(s.equals(s1))
            System.out.println("they are equal.");
        else
            System.out.println("they are not equal");


        System.out.println(s.compareTo(s1));


        System.out.println(s.compareToIgnoreCase(s1));


        System.out.println(s.contentEquals(s1));


        System.out.println(s.regionMatches(2,"Never",5,6));


        System.out.println(s.startsWith("Never"));


        System.out.println(s.endsWith("Never"));


        System.out.println(s.hashCode());


        System.out.println(s.indexOf("v"));


        System.out.println(s.indexOf("r",10));


        System.out.println(s.lastIndexOf("v",8));


        System.out.println(s.lastIndexOf("ve"));


        System.out.println(s.substring(10,23));


        System.out.println(s.substring(8));


        System.out.println(s.subSequence(2,17));


        System.out.println(s.concat(s1));


        System.out.println(s1.replace("b","T"));


        System.out.println(s.matches(s1));


        System.out.println(s.contains(s1));


        System.out.println(s.replaceFirst("Never","Ever"));


        System.out.println(s.replaceAll("Never","Ever"));


        System.out.println(s.split("Never"));


        System.out.println(s.split("Never", 10));


        System.out.println(s.join(s1));


        System.out.println(s.toLowerCase());


        System.out.println(s.toUpperCase());
    }


}
