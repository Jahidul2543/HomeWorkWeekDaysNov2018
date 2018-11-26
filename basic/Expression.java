package basic;

public class Expression extends TwoNumberInput {

    @Override
    public void multiply() {

        System.out.println("The result is :"+((x*y-y*y)/x-y));
    }

    public static void main(String[] args) {
        Expression obj1 = new Expression();
        obj1.TwoNumberInput();
        obj1.multiply();
    }

}
