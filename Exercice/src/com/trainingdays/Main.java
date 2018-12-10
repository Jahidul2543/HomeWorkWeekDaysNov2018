package com.trainingdays;

import java.util.Scanner;

public class Main {

//Declare Object Scanner
     static Scanner scan = new Scanner(System.in);

    public static void  main(String[] args) {
        randomGame();
    }
    //     Declare random int
    static int random = (int) Math.floor(Math.random()*10);


    //Check condition
    public static int randomNumber(int enternumber){
        if(random == enternumber){
            return -1;
        }else {
            return 0;
        }
    }

    //    Final function loop till false ! false will when callit == -1
    public static void randomGame(){
//        Hint just to know the random number
        System.out.println(random);
        int number;
        int callit = 0;
        while (callit!=-1){
            System.out.println("Enter a number ");
            number = scan.nextInt();
            callit = randomNumber(number);
            System.out.println("Another  time bro"+"\n");
        }
        System.out.println("Yeeah you've guessed");
    }


}

