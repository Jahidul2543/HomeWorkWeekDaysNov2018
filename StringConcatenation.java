package HomeWorkWeekDaysNov2018;

public class StringConcatenation {

    // simple concatenation
    String firstName = "Muhammad";
    String middle = "Afnan";
    String lastName="Saeed";

    String firstAndLastName = firstName+lastName;

    public static void main(String[] args) {
        StringConcatenation obj1 = new StringConcatenation();
        // using concat methd within concat method
        System.out.println(obj1.firstName.concat(obj1.middle.concat(obj1.lastName)));

    }


}
