package main;

public class switchStatement {
    public static void main (String[]args){
                                                        //     switch statement tests one variable and depending on
    int age;                                           //      the value of that variable it gives you multiple choices
    age = 3;

    switch (age){

        case 1:
            System.out.println( "you can crawl");
        break;

        case 2:
            System.out.println( "you can talk");
            break;

        case 3:
            System.out.println ( "you can walk");
            break;

            default:
                System.out.println ( "unknown");
                break;
    }
    }
}
