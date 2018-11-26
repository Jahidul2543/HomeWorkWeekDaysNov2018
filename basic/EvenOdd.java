package basic;

public class EvenOdd extends TwoNumberInput {

    public static void main(String[] args) {

        TwoNumberInput obj1 = new TwoNumberInput();

        obj1.TwoNumberInput();

        if(obj1.x%2 >0){
            System.out.println("First Num is Odd");

        }else{
            System.out.println("First Num is Even");
        }
        if(obj1.y%2 >0){
            System.out.println("Second Num is Odd");

        }else{
            System.out.println("Second Num is Even");
        }

    }
}
