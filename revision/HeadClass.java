package HomeWorkWeekDaysNov2018.revision;

public class HeadClass implements Calculations {

    int num1; // constructor variable
    private int num2; // constructor variable
    private int addnum1, addnum2, subnum1,subnum2,mulnum1,mulnum2,divnum1,divnum2;

    public HeadClass(){}
    public HeadClass(int x, int y){
        this.num1 = x;
        this.num2=y;

    }

    @Override
    public int addition(int x, int y) {
        this.addnum1 = x;
        this.addnum2 = y;

        return addnum1+addnum2;
    }

    @Override
    public int subtraction(int x, int y) {
        this.subnum1 = x;
        this.subnum2 = y;
        return subnum1-subnum2;
    }


    @Override
    public int multiplication(int x, int y) {
        this.mulnum1 = x;
        this.mulnum2 = y;
        return mulnum1*mulnum2;
    }
    @Override
    public int division(int x, int y) {
        this.divnum1 = x;
        this.divnum2 = y;
        return divnum1/divnum2;
    }

    public void total(){

        System.out.println("That's it");

    }

}
