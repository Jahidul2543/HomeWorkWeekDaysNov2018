package com.trainingdays;

public class BasicInherenetce   {


    String abc = "Abc";
    int num = 123;

    BasicInherenetce (String abc,int num){
        this.abc = abc;
        this.num = num;

    }
    public String message(){
        System.out.println("Hey from parent class");
        return "ss";
    }

   public BasicInherenetce (){


    }


}

class B1 extends BasicInherenetce{
//Constructor
    B1(){
    }

    public void subMessage(){
        System.out.println("Hey from subMessage");
    }



    boolean pravda;

    B1(String abc, int num,boolean pravda) {
        super(abc, num);
        this.pravda = pravda;

    }



    public static void main(String[] args) {

        B1 obj = new B1();
        obj.message();
        obj.subMessage();
        BasicInherenetce covaf = new BasicInherenetce();






    }



}