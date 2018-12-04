package HomeWorkWeekDaysNov2018;

public class StringCompare extends ToUpper {
    public StringCompare(){

    }

    String name, dept;
    int age;
    // making Constructor for ArrayListObject Class

    public StringCompare(String name, int age, String dept){
        this.name = name;
        this.age = age;
        this.dept = dept;


    }


    public static void main(String[] args) {
        StringCompare obj1 = new StringCompare();

        String firstName1  ="4";
        String lastName2 = "5";
        System.out.println(firstName1.compareTo(lastName2));


        obj1.firstName  ="New York";
        obj1.lastName = "NEW york";
        // converting both values to upper case first and then comparing
        System.out.println(obj1.firstName.toUpperCase().compareTo(obj1.lastName.toUpperCase()));
        // compare up to the point where first unicode value is different is larger
        //Below i used only one word to comapre the full name and its show single word is larger
        System.out.println(obj1.firstName.toUpperCase().compareTo("O"));


    }
}
