package basic;

public class CompareTwoNumber extends TwoNumberInput {

    public static void main(String[] args) {

        TwoNumberInput obj1 = new TwoNumberInput();

        obj1.TwoNumberInput();

        int firstNum, secondNum;
        firstNum = obj1.x;
        secondNum = obj1.y;

        if(firstNum > secondNum){
            System.out.printf("%2d > %2d\n",firstNum,secondNum);
            System.out.printf("%2d != %2d",firstNum,secondNum);

        }
        else if( firstNum <secondNum){
            System.out.printf("%2d < %2d\n",firstNum,secondNum);
            System.out.printf("%2d != %2d",firstNum,secondNum);
        }
        else{
            System.out.printf("%2d = %2d",firstNum,secondNum);

        }
    }
}
