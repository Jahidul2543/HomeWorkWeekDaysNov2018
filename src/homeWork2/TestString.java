package homeWork2;

public class TestString {

    public static void main(String[] args) {

        String s = "Never Complain And Never Explain ";
        String s1= "bird";

// 1. charAt at.
        System.out.println(s.charAt(3));
//2.
        System.out.println(s.length());


 //3.
        System.out.println(s.codePointAt(2));


//4.
        System.out.println(s.codePointBefore(8));

//5.
        System.out.println(s.codePointCount(4,15));

//6.
        char [] charArray =new char[10];
        s.getChars(1,5,charArray ,1);
        System.out.println(charArray);

//7 getBytes metohd
        System.out.println(s.getBytes());

//8. equal method
        if(s.equals(s1))
        System.out.println("they are equal.");
        else
            System.out.println("they are not equal");

//9.
        System.out.println(s.compareTo(s1));

//10.
        System.out.println(s.compareToIgnoreCase(s1));

//11.
        System.out.println(s.contentEquals(s1));

//12.
        System.out.println(s.regionMatches(2,"Never",5,6));

//13.
        System.out.println(s.startsWith("Never"));

//14.
        System.out.println(s.endsWith("Never"));

//15.
        System.out.println(s.hashCode());

//16.
        System.out.println(s.indexOf("v"));

//17.
        System.out.println(s.indexOf("r",10));

//18.
        System.out.println(s.lastIndexOf("v",8));

//19.
        System.out.println(s.lastIndexOf("ve"));

//20.
        System.out.println(s.substring(10,23));

//21.
        System.out.println(s.substring(8));

//22.
        System.out.println(s.subSequence(2,17));

//23.
        System.out.println(s.concat(s1));

//24.
        System.out.println(s1.replace("b","T"));

//25.
        System.out.println(s.matches(s1));

//26.
        System.out.println(s.contains(s1));

//27.
        System.out.println(s.replaceFirst("Never","Ever"));

//28.
        System.out.println(s.replaceAll("Never","Ever"));

//29.
        System.out.println(s.split("Never"));

//30.
        System.out.println(s.split("Never", 10));

//31.
        System.out.println(s.join(s1));

//32.
        System.out.println(s.toLowerCase());

//33.
        System.out.println(s.toUpperCase());
    }
}
