public class StringMethods {

    public static void main (String[] args) {

        String s = "Second Homework";

        // 1. Returns the numbers of characters in the string.
        s.length();
        System.out.println(s.length());

        //2. Returns the character at 3rd index.
        s.charAt(3);
        System.out.println(s.charAt(3));

        //3. Returns the substring from the 1st index character to end.
        s.substring(1);
        System.out.println(s.substring(1));

        //4. Returns the substring from 2 to 4-1 index.
        s.substring(2, 4);
        System.out.println(s.substring(2, 4));

        //5. Concatenates one string to the end of another string.
        String s1 = "Second";
        String s2 = "Homework";
        System.out.println(s1.concat(s2));

        //6. Returns the index where the string "Homework" first appears.
        s.indexOf("Homework");
        System.out.println(s.indexOf("Homework"));

        //7. Returns the index of 'o' the first time it appears starting at index 4.
        s.indexOf('o', 4);
        System.out.println(s.indexOf('o', 4));

        //8. Returns the index of the last time 'o' appears.
        s.lastIndexOf('o');
        System.out.println(s.lastIndexOf('o'));

        //9. Checks if one string equals to another
        Boolean out = "Second".equals("Homework");
        System.out.println("Second".equals("Homework"));

        //10. Compares one string to another, ignoring case sensitivity.
        Boolean ignoreCase = "Second".equalsIgnoreCase("second");
        System.out.println(ignoreCase);

        //11. Compares two string lexicographically.
        int comp = s2.compareTo(s1);
        System.out.println(s2.compareTo(s1));

        String s3 = "homework";
        System.out.println(s2.compareTo(s3));


        //12. Compares two strings lexicographically while ignoring case sensitivity.
        int comparison = s2.compareToIgnoreCase(s3);
        System.out.println(comparison);

        //13. Converts the string "Homework" (s2) to lowercase --> "homework".
        String s4 = s2.toLowerCase();
        System.out.println(s4);

        //14. Converts the string "marzana" to uppercase.
        String word = "marzana";
        System.out.println(word.toUpperCase());

        //15. Removes the white space at both ends of the string.
        String word1 = " I don't want to do homework ";
        System.out.println(word1.trim());

        //16. Returns new string by replacing all occurrences of oldChar with newChar.
        String newString = "fun homework";
        String newString2 = newString.replace('f', 'g');
        System.out.println(newString2);

        //17. Copies characters from the string "Second Homework" into the destination character array called
        // newCharArray.
        char[] newCharArray = new char[10];
        s.getChars(1, 5, newCharArray, 1);
        System.out.println(newCharArray);

        //18. Returns the unicode value of index 1 which is 'e'.
        int codepointat = s.codePointAt(1);
        System.out.println("The unicode at index 1: " + codepointat);

        //19.
        String str = "She sells sea shells by the sea shore";
        System.out.println("String str starts with quick: " + str.startsWith("She"));
        System.out.println("String str starts with sells: " + str.startsWith("sells"));

        //20.
        System.out.println("substring of str (starting from 4th index) has sells prefix: " + str.startsWith("sells", 4));

        //21.
        System.out.println("String str ends with shore: " + str.endsWith("shore"));

        //22.
        System.out.println(str.subSequence(1, 8));

        //23.
        boolean bol = true;
        boolean bol2 = false;
        String buls1 = String.valueOf(bol);
        String buls2 = String.valueOf(bol2);
        System.out.println(buls1);
        System.out.println(buls2);

        //24.
        String stringDemo = "I want coffee";
        char[] ch = stringDemo.toCharArray();
        System.out.println(ch);

        //25.
        String name = "Can you make me noodles?";
        System.out.println(name.contains("noodles"));

        //26.
        String empty = "";
        String notEmpty = "not empty";
        System.out.println(empty.isEmpty());
        System.out.println(notEmpty.isEmpty());

        //27.
        char[] strn1 = {'H', 'e', 'l', 'l', 'o'};
        String strn2 = "";
        strn2 = strn2.copyValueOf(strn1);
        System.out.println(strn2);

        //28.
        int sg1 = 10;
        String sample;
        sample = String.valueOf(sg1);
        System.out.println(sample);

        //29.
        float ft = 1.20f;
        String sample2;
        sample2 = String.valueOf(ft);
        System.out.println(sample2);

        //30.
        String b = "Candy";
        String c = b.replace("Candy", "give");
        System.out.println(c);

    }
}
