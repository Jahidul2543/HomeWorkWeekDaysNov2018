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
        s.substring(2,4);
        System.out.println(s.substring(2,4));

        //5. Concatenates one string to the end of another string.
        String s1 = "Second";
        String s2 = "Homework";
        System.out.println(s1.concat(s2));

        //6. Returns the index where the string "Homework" first appears.
        s.indexOf("Homework");
        System.out.println(s.indexOf("Homework"));

        //7. Returns the index of 'o' the first time it appears starting at index 4.
        s.indexOf('o',4);
        System.out.println(s.indexOf('o',4));

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












    }
}
