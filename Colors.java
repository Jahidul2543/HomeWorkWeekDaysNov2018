package main;

public class Colors {

    public static void main (String [] args){
        String [] names = {"red", "blue", "green"};

        System.out.println (names[0]);
        System.out.println (names[1]);
        System.out.println (names[2]);

        // this can be written as an array which is shown below.

        for (String n : names ){
            System.out.println (n);

        }



    }
}
