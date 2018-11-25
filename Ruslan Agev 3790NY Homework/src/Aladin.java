public class Aladin  extends Person{

    int salary = 0;

    public  Aladin(String Name, String Lname,int age ,int salary){
        super(Name,Lname,age);
        this.salary = salary;


        getObjectMessage();{

            System.out.println("My name is ".concat(Name).concat(" I am ") + age +" years old ".concat("My salary is ") + salary + "$");


        }




    }






}
