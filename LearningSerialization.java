package HomeWorkWeekDaysNov2018;


import java.io.Serializable;

public class LearningSerialization implements Serializable  {

     int age = 100;
     String name = "Muhammad Afnan Saeed";
     String intr1;


    public void introduction(){
        System.out.printf("My name %s and %d year old\n ",name,age);
    }

    public static void main(String[] args) {

    }
}
