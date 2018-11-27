public class Human {

    public static void main(String[] args) {


        Humans John = new Humans("John",55,80000);
        Arabic Steve = new Arabic("Steve",25,60000);
        Steve.Speak();
        John.Speak();

    }

    public static class Humans{
        String name;
        int age;
        int salary;

        public void Speak() {
            System.out.print("My Name Is " + name + "," +" I Am  " + age + " Years Old," + " My Salary Is $" + salary);
        }


        public Humans(String name,int age,int salary){

            this.name = name;
            this.age = age;
            this.salary = salary;





        }


    }



}
