package com.trainingdays;

 class ImplementInterfaces implements MultiInheretence,SubInterface, MultiInheretence.NestedInterface {
    @Override
    public void gear() {
        System.out.println("Gear has been Changed ");
    }

    @Override
    public void run() {
        System.out.println("Car is running ");
    }

    public void msg(){
        System.out.println("Hello im from nested Interface");
    }
}


