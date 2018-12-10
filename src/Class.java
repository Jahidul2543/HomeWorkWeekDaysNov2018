package Classes_Objects;


import java.util.*;

public  class Class {



    public static class Address {
        String city,state,county;

        public Address(String city,String state,String county){
            this.city = city;
            this.state = state;
            this.county = county;

        }


    }


   public static class Employee{
        int id;
        String name;
        Address address;


        public  Employee(int id, String name, Address address){

            this.id = id;
            this.name = name;
            this.address = address;


        }

         void  dispaly(){
           System.out.println(id+" "+name+" "+address.city +" "+ address.state+ " " + address.county);
       }

   }






    }




















