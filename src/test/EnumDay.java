package test;

public class EnumDay {

    Day ss;

    public EnumDay(Day ss) {
        this.ss = ss;
    }

    public void howWillBeTheDay() {

        switch (ss) {
            case MON:
                System.out.println("its gonna be lazy");
                break;
            case TUE:
                System.out.println("god day");
                break;
            case FRI:
                System.out.println("fev day");
                break;
        }

    }

    public static void main(String[]args) {
        EnumDay objectofEnumday = new EnumDay(Day.MON);
        objectofEnumday.howWillBeTheDay();
        for (Day d : Day.values()) {
            System.out.println("gagagag " + d);
        }
    }

}