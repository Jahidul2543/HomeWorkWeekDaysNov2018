public class Turkmeni extends Person{


    public  Turkmeni(String Name, String Lname,int age){
        super(Name,Lname,age);


        getObjectMessage();{

            System.out.println("My name is ".concat(Name).concat(" I am ")
                    + age +" years old ");


        }

    }
}
