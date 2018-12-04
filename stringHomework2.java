package strings;

public class stringHomework2 {

    public static void main(String[]args){

        String x = "Hey everyone my name is Jeny ";

        String y = "I like purple ";

        String z = "and pink";


        // 1. length

        System.out.println(x.length());



        //2.

        System.out.println("The length of " + y + " is : " + y.length());



        //3.

        System.out.println("The length of " + z + " is : " + z.length());



        //4. charAt

        System.out.println(x.charAt(5));



        //5.

        System.out.println(x.charAt(26));



        //6. substring (int i)

        System.out.println(x.substring(12));



        //7.

        System.out.println(x.substring(20));




        //8. substring (int i, int j)

        System.out.println(x.substring(4,12));




        //9.

        System.out.println(y.substring(2, 5));




        //10. concat

        System.out.println(x.concat(y));




        //11.

        System.out.println(y.concat(z));




       //12.

        System.out.println(x.concat(y + z));




        //13. int indexOf(String )

        System.out.println(x.indexOf ("name"));




        //14.

        System.out.println(y.indexOf ("like"));




        //15.

        System.out.println(z.indexOf("pink"));




        //16. int indexOf (String , int )

        System.out.println(x.indexOf( 'm', 7));




        //17.

        System.out.println(y.indexOf( 'p', 4));





        //18. int lastingIndexOf (int char)

        System.out.println(x.lastIndexOf ('e'));




        //19.

        System.out.println(x.lastIndexOf ('a'));



        //20.

        System.out.println(y.lastIndexOf ('k'));




        //21. boolean equals (object otherObj)

        System.out.println(z.equals("and pink"));




        //22.

        System.out.println(y.equals("I like purple "));




        //23. boolean equalsIgnoreCase

        System.out.println(y.equalsIgnoreCase ("i like Purple "));





        //24.

        if (x.equals("Hey everyone my name is Jeny "))

            System.out.println("they are equal");

        else
            System.out.println("not equal");




        //25.

        System.out.println(y.compareTo(x));





        //26. String toLowerCase

        System.out.println(x.toLowerCase());





        //27. String  toUpperCase

        System.out.println(y.toUpperCase());





        //28. String trim

        System.out.println(y.trim());





        //29. String replace

        System.out.println(x.replace ('J','M'));




        //30.

        System.out.println(x.replace ('e','a'));


















































    }




}
