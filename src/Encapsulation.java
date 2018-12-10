package com.trainingdays;

public class Encapsulation {


    private String name;
    private int accNumber;

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }
}

class SubClassforEncapsulation extends Encapsulation{
    public static void main(String[] args) {
        Encapsulation objE = new Encapsulation();
        objE.setName("hasan");
        objE.setAccNumber(12121313);
        System.out.println(objE.getName()+objE.getAccNumber());
    }
}
