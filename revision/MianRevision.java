package HomeWorkWeekDaysNov2018.revision;

public class MianRevision {


    public static void main(String[] args) {

        HeadClass obj1 = new HeadClass(50, 25);
        System.out.println("Addition : " + obj1.addition(200,300));
        System.out.println("Subtraction : " + obj1.subtraction(200, 150));
        System.out.println("Multiplication : " + obj1.multiplication(20,30));
        System.out.println("Division : " + obj1.division(20,5));
        obj1.total();

    }
}
