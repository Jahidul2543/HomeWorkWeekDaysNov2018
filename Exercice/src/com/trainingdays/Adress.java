package com.trainingdays;

public class Adress {
    String country,state,city;


    Adress(String country,String state,String city){
        this.country = country;
        this.state = state;
        this.city = city;

    }


    public static class Employee{
        String name,lname;
        int id;
        Adress adress;

        Employee(String name,String lname,int id,Adress adress){
            this.name = name;
            this.lname = lname;
            this.id = id;
            this.adress = adress;

        }

        public String adressMessage(){
            System.out.println(name+lname+id+adress.country+adress.state+adress.city);
            return "";
        }


    }

    public static void main(String[] args) {
        Adress newAdress = new Adress("Usa","NY","Nyc");
        Employee newEmployee = new Employee("Roy","Jake",1,newAdress);
        System.out.println(newEmployee.adressMessage());
    }

}
