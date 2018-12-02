public class ArrayPractice {

    public static void main(String[] args) {

        //1. First array example

        int[] anArray;

        anArray = new int[4];

        anArray[1] = 5;
        anArray[2] = 6;
        anArray[3] = 7;
        anArray[0] = 8;

        System.out.println("Element at index 1: " + anArray [1]);
        System.out.println("Element at index 2: " + anArray [2]);
        System.out.println("Element at index 3: " + anArray [3]);
        System.out.println("Element at index 0: " + anArray [0]);


        //2. Second array example

        String[] studentNames;

        studentNames = new String[5];

        studentNames[0] = "Arnob";
        studentNames[1] = "Sam";
        studentNames[2] = "Hacene";
        studentNames[3] = "Sajid";
        studentNames[4] = "Rizwan";

        System.out.println(studentNames[0]);
        System.out.println(studentNames[1]);
        System.out.println(studentNames[2]);
        System.out.println(studentNames[3]);
        System.out.println(studentNames[4]);


        //3. Third array example

        char[] studentInitials;

        studentInitials = new char[3];

        studentInitials[0] = 'a';
        studentInitials[1] = 'b';
        studentInitials[2] = 'c';

        System.out.println(studentInitials[0]);
        System.out.println(studentInitials[1]);
        System.out.println(studentInitials[2]);


        //4. Fourth array example

        int[] id;

        id = new int[3];

        id[0] = 51;
        id[1] = 52;
        id[2] = 53;

        System.out.println(id[0]);
        System.out.println(id[1]);
        System.out.println(id[2]);


        //5. Fifth array example

        int[] idtwo = {51,52,53};
        System.out.println(idtwo[0]);

    }
}
