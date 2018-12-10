


public class Polish extends Person{


    public  Polish(String Name, String Lname,int age){
        super(Name,Lname,age);


        getObjectMessage();{

            System.out.println("My name is ".concat(Name ) +" ".concat( Lname).concat(" I am ")
                    + age +" years old ");


        }

    }
}


