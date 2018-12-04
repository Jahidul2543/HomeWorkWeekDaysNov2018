package HomeWorkWeekDaysNov2018;

public class ThrowsException {
    int x =10;
    int y = 19;
    int z = 0;
    public void add() throws ArithmeticException{


        System.out.println(x+y);
        divide();

    }

    public void divide() throws ArithmeticException{

        System.out.println(x/10);

    }

    public void subtract() throws ArithmeticException{
        System.out.println(y-x);
        divide();
        System.out.println(y/z);
    }

    public static void main(String[] args) {

        ThrowsException obj1 = new ThrowsException();
        obj1.divide();
        obj1.add();
        obj1.subtract();



    }
}

