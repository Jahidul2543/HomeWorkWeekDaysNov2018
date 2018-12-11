public class IfThenElse {

    public static void main(String[] args) {

        //1. Example #1

        int testscore = 40;
        char grade = 'c';

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }


        //example

        int score = 50;
        char classGrade = 'f';

        if (score >= 90) {
            classGrade = 'j';
        } else if (score >= 80) {
            classGrade = 'k';
        } else if (score >= 70) {
            classGrade = 'l';
        } else {
            grade = 'm';
        }
        System.out.println("grade = " + classGrade);


        //2. Example #2
        int x = 1;
        int y = 2;
        int newResult;
        boolean newCondition = true;
        if (newCondition = true) {
            newResult = x;
        } else {
            newResult = y;
        }



        //new example for class

        int a = 1;
        int b = 2;
        int newVariable;
        boolean condition = true;

        if (condition = true) {
            newVariable = a;
        } else {
            newVariable = b;
        }



        //3. Example #3

        int A = 1;
        int B = 2;
        int result;
        boolean someCondition = false;
        result = someCondition ? A : B;
        System.out.println(result);
    }
}
