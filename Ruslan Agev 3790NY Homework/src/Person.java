public class Person {
    String Name;
    String Lname;
    int age;

    public Person(String Name,String Lname,int age){
        this.Name = Name;
        this.Lname = Lname;
        this.age = age;
    }

    String objectMessage = "" ;
    public  Person() {
        super();

    }
        public void getObjectMessage() {



        }

        public void setObjectMessage(String newMessage) {
            objectMessage = newMessage;
        }




}



