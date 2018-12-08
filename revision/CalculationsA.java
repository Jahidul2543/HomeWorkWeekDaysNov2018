package HomeWorkWeekDaysNov2018.revision;

public class CalculationsA extends HeadClass {

    @Override
    public int addition(int x, int y) {
        return 3 *(x+y);


    }

    public static void main(String[] args) {

        Calculations obj1 = new CalculationsA();
        Calculations obj2 = new HeadClass(100,50);

        System.out.println(obj1.addition(12,14));

    }

    }

