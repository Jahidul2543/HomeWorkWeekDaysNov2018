package com.trainingdays;

public class TryCatch {
    public static void main(String[] args) {



        try{
            int a[]=new int[5];
            a[10]=4;


        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
            System.out.println("I dont know what kind of exeptioh");


        }
    }
}
