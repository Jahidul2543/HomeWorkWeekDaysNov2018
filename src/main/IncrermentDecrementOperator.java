package main;

public class IncrermentDecrementOperator {

    public static void main(String[] args) {
        for(int i=1; i<11; i++){
            System.out.println(" "+i);
        }
        // Enhanced for/ for each loop.
        int [] numbers =
                {1,2,3,4,5,6,7,8,9,10};

        for (int item : numbers){
            System.out.println("Count is " +item);
        }
         int [] digit ={1,2,3,4,5,6,7,};

        for (int item : digit){
            System.out.println("Count is " +item);
        }

    }


}
