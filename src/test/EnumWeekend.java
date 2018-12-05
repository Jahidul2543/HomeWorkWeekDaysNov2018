package test;

public class EnumWeekend {

    WeekEnd weekEnd;

    public EnumWeekend(WeekEnd weekEnd) {
        this.weekEnd = weekEnd;
    }

    public void weekEndifo() {
        switch (weekEnd) {
            case Sat:
                System.out.println("It feels like heaven");
                break;
            case Sun:
                System.out.println("Winter is coming");
        }
    }

    public static void main(String[] args) {
        EnumWeekend sat =new EnumWeekend(WeekEnd.Sat);
        EnumWeekend sun= new EnumWeekend(WeekEnd.Sun);

        sat.weekEndifo();
       // sun.weekEndifo();

        /*for(WeekEnd w : WeekEnd.values()){
            System.out.println(w);*/

        }


    }
