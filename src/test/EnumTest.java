package test;

public class EnumTest {
    Day day;
    public EnumTest(Day day){
        this.day = day;
    }
    public void howWillBeTheDay(){

        switch (day){
            case MON:
                System.out.println("Lazy Day");
                break;
            case TUE:
                System.out.println("Better Day");
                break;
            case WED:
                System.out.println("Happy day coming");
                break;
            case THU:
                System.out.println("Working from home");
            case FRI:
                System.out.println("Waiting for weekend");
                break;
        }

    }
    public static void main(String[] args) {
        EnumTest objOfEnumTest = new EnumTest(Day.FRI);
        objOfEnumTest.howWillBeTheDay();
        EnumTest objOfEnumTest2 = new EnumTest(Day.MON);
        objOfEnumTest2.howWillBeTheDay();

        for (Day d : Day.values()){

            System.out.println( "Print all enums from Day " + d);
        }
    }
}

/*
 *
 * All enums implicitly extend java.lang.Enum. Because a class can
 * only extend one parent (see Declaring Classes), the Java language
 * does not support multiple inheritance of state (see Multiple Inheritance of State,
 * Implementation, and Type), and therefore an enum cannot extend anything else.
 *
 * */

