package HomeWorkWeekDaysNov2018;

public class ToUpperAndLower {

    String firstName = "Muhammad";
    String middle = "Afnan";
    String lastName="Saeed";

    String firstAndLastName = firstName+lastName;


    public static void main(String[] args) {
        ToUpperAndLower obj1 = new ToUpperAndLower();

        System.out.println(obj1.firstAndLastName.toLowerCase());

        // converted String into char Array using string method
        char[] nameArray = obj1.lastName.toCharArray();
        // using loop to make sure that we iterate through Array

        for(int i = 0 ;i<nameArray.length;i++){
            System.out.println(nameArray[i]);

        }
        char[] firstNameArray = obj1.firstName.toCharArray();
//     using foreach loop here
        for(char item: firstNameArray){
            System.out.println(item);

        }
//        System.out.println(firstNameArray);
    }

}
