package HomeWorkWeekDaysNov2018.revision;

import java.sql.SQLOutput;

public class PractingLoops {

    String firstName ="Muhammad";
    String middleName = "Afnan";
    String lastName = "Saeed";

    int favNum =786;
    char character ='M';
    byte startNum = 70;
    byte secondNum = 75;


    public String fullName(){

        return firstName+" "+middleName+" "+lastName;

    }
    public void favoriteNum(){
        fullName();
        System.out.println("The first Number is "+ favNum);
        System.out.println("The Second Number is : "+ secondNum);
    }

    public void whileTry(){
        favoriteNum();
        while(startNum<secondNum){
            System.out.println(startNum);
            startNum+=1;
        }
    }
    public void allMethod(){
        // print method 5 time
        for(int i = 0; i<=20;i+=5){

            System.out.printf("Printing %2d //incrementing 5 times :) \\\\\n",i);
            System.out.println(fullName());
            System.out.println("*********");
        }
        arrayDisplay2();
    }

    int[] xyz =  new int[10];



    public void arrayDisplay(){
            whileTry();
        // Priniting Array List First with loop and then displaying with for each loop

        // filling array list with for loop
        for(int i =0; i <10; i++){

        xyz[i]=i;// problem facing with
        }

        //printing Array list value with for each loop

        for(int x: xyz){
            System.out.println("Printing "+xyz[x]);
        }

    }

    public void arrayDisplay2(){
        arrayDisplay();

        System.out.println("Prinitng Second time same array variable with different values");
        int y =1;
        for(int i = 10; i <xyz.length;i++){

            xyz[y]=444;
            y++;
        }

        for(int x : xyz){
            System.out.println(xyz[x]);
        }
    }


    public static void main(String[] args) {

        PractingLoops obj1 = new PractingLoops();

        // calling one method
        // one method contain other method.
        // one method trigger all method
        // they are related with each other

//         obj1.favoriteNum();
        // obj1.whileTry();
        // obj1.arrayDisplay();

        // obj1.arrayDisplay2();


        obj1.allMethod();


    }








}
