


public class galaxy extends Mobiletype{


    public  galaxy(String Fname, String Lname,int age){
        super(Fname,Lname,age);


        getObjectMessage();{

            System.out.println("My name is ".concat(Fname ) +" ".concat( Lname).concat(" I am ")
                    + age +" years old ");


        }

    }
}


