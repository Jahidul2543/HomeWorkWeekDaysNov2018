package basic;
import java.util.Scanner;

public class AscendingOrder extends TwoNumberInput{

    public static void main(String[] args) {

        TwoNumberInput obj1 = new TwoNumberInput();

        obj1.TwoNumberInput();
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter third Number");
        int z = obj2.nextInt();
        int first = 0,second=0,third=0;
        if(obj1.x>obj1.y && obj1.x>z){
            System.out.printf("%2d is the bigger Number ",obj1.x);
            first+=obj1.x;
            if(obj1.y>z){
                second+=obj1.y;
                third+=z;

            }else{
                second+=z;
                third+=obj1.y;
            }
        }
        else if(obj1.y>obj1.x && obj1.y>z){
            System.out.printf("%2d is the bigger Number ",obj1.y);
            first+=obj1.y;
            if(obj1.x>z){
                second+=obj1.x;
                third+=z;

            }else{
                second+=z;
                third+=obj1.x;
            }

        }
        else if(z>obj1.x && z>obj1.y){
            System.out.printf("%2d is the bigger Number ",z);
            first+= z;
            if(obj1.x>obj1.y){
                second+=obj1.x;
                third+=obj1.y;

            }else{
                second+=obj1.y;
                third+=obj1.x;
            }
        }
        System.out.printf("\nThe descending order  is %2d Second %2d third %2d", first, second,third);
    }
}
