package test;

public class EnumMonth {

    Month month;

    public EnumMonth(Month month) {

        this.month = month;
    }

    public void monthInfo() {
        switch (month) {
            case Jan:
                System.out.println("Happy New year");
                break;
            case Feb:
                System.out.println("Shortest Month");
                break;
            case Mar:
                System.out.println("Happy Birthday Bangladesh");
                break;
            case Apr:
                System.out.println("Fourth month ");
                break;
            case May:
                System.out.println("May day");
                break;
            case Jun:
                System.out.println("Half done");
                break;
            case Jul:
                System.out.println("Happy Birthday America");
                break;
            case Aug:
                System.out.println("Seventh Month");
                break;
            case Sep:
                System.out.println("Back to school");
                break;
            case Oct:
                System.out.println("Happy Hallowen");
                break;
            case Nov:
                System.out.println("Happy Thanksgiving");
                break;
            case Dec:
                System.out.println("Merry Christmas");
                break;


        }
    }

    public static void main(String[] args) {

        EnumMonth objectOfEnumMonth1 = new EnumMonth(Month.Jan);
        EnumMonth objectOfEnumMonth2 = new EnumMonth(Month.Feb);
        EnumMonth objectOfEnumMonth3 = new EnumMonth(Month.Mar);
        EnumMonth objectOfEnumMonth4 = new EnumMonth(Month.Apr);
        EnumMonth objectOfEnumMonth5 = new EnumMonth(Month.May);
        EnumMonth objectOfEnumMonth6 = new EnumMonth(Month.Jun);
        EnumMonth objectOfEnumMonth7 = new EnumMonth(Month.Jul);
        EnumMonth objectOfEnumMonth8 = new EnumMonth(Month.Aug);
        EnumMonth objectOfEnumMonth9 = new EnumMonth(Month.Sep);
        EnumMonth objectOfEnumMonth10 = new EnumMonth(Month.Oct);
        EnumMonth objectOfEnumMonth11 = new EnumMonth(Month.Nov);
        EnumMonth objectOfEnumMonth12 = new EnumMonth(Month.Dec);

        objectOfEnumMonth1.monthInfo();
        objectOfEnumMonth2.monthInfo();
        objectOfEnumMonth3.monthInfo();
        objectOfEnumMonth4.monthInfo();
        objectOfEnumMonth5.monthInfo();
        objectOfEnumMonth6.monthInfo();
        objectOfEnumMonth7.monthInfo();
        objectOfEnumMonth8.monthInfo();
        objectOfEnumMonth9.monthInfo();
        objectOfEnumMonth10.monthInfo();
        objectOfEnumMonth11.monthInfo();
        objectOfEnumMonth12.monthInfo();


        /*for (Month m : Month.values()) {
            System.out.println("this is " +m);


        }*/


    }


}





