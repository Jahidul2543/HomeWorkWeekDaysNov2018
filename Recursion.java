package HomeWorkWeekDaysNov2018;

public class Recursion {

    public static int summation(int y){

        if(y<1){
            return 2;
        }
        else{
            return y * summation(y-1);
        }
    }


    public static void main(String[] args) {
        System.out.println(summation(5));
    }
}
