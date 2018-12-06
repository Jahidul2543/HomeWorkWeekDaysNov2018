package HomeWorkWeekDaysNov2018.revision;

public class MianRevision {


    public static void main(String[] args) {

        AbstractClass2 obj1 = new AbstractClass2();

        obj1.addition6();

        obj1.addition5();
        System.out.println("****************");

        obj1.setFullName("Imran","Khan");

        obj1.mrthodforabstractClass();
        obj1.description("The class who is implemending the interface, its that class responsibilty to completet the interface" +
                "","Here AbstractClass2 completing the InterfacePractice",3.5);

        System.out.println("The return from first result is :"+ obj1.result1());
        System.out.printf("The result is %2d",obj1.result1(300,300));

    }
}
