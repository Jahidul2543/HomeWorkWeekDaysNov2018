public class Azerbaijantsi extends Person{
    int salary = 0;
    String typyOfSport;

    public  Azerbaijantsi(String Name, String Lname,int age ,int salary,String typyOfSport){
        super(Name,Lname,age);
        this.salary = salary;
        this.typyOfSport = typyOfSport;

           getObjectMessage();{

            System.out.println("My name is ".concat(Name).concat(" I am ")
                    + age +" years old ".concat("My salary is ") +  salary + "$ " + "I do " + typyOfSport);


        }

    }
}
