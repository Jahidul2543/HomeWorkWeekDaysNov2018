package Classes_Objects;

public class SubClass extends Class.Employee {

    public SubClass(int id, String name, Class.Address address){
        super(id,name,address);

    }

    void dispaly(){
        System.out.println(id+" "+name+" "+address.city +" "+ address.state);
    }





    public static void main(String[] args) {

        Class.Address subAdres = new Class.Address("Samara","Ro","Russia");
        SubClass subobj1 = new SubClass(1,"Aeon",subAdres);
        subobj1.dispaly();



        Class.Employee emp2 = new Class.Employee(2,"Igna",subAdres);
        emp2.dispaly();


    }
}
