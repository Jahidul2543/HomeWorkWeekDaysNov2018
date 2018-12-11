public class Person {

    String fname;
    String lname;
    int weight;

    public void person(){
        System.out.println("Hi my first name is " + fname+ "and my last name is " +lname+ "and my weight is " +weight);

    }

    public Person(String fname,String lname,int weight){
        this.fname=fname;
        this.lname=lname;
        this.weight=weight;
    }

    public static void main(String[] args) {
        Person per=new Person("Ziyad","Hussain",205);
        per.person();
        System.out.println(per.fname);

    }
}