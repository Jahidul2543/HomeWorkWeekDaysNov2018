package HomeWorkWeekDaysNov2018;

public class ToUpper extends ToUpperAndLower {

    public static void main(String[] args) {
        ToUpperAndLower obj2 = new ToUpperAndLower();
        ToUpper obj1 = new ToUpper();
        ToUpper obj3 = new ToUpper();

       System.out.println(obj2.firstName.isEmpty());

        System.out.println(obj3.equals(obj1));

        System.out.println(obj2.firstName.toUpperCase());
        System.out.println(obj2.firstName.toLowerCase());
    }

}
