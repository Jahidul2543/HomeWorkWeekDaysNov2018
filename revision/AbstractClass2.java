package HomeWorkWeekDaysNov2018.revision;

public class AbstractClass2 extends AbtractClass implements InterfacePractice2,InterfacePractice3 {

    @Override
    public void addition5() {
        System.out.println("This is method declared in Abstract Class");
        System.out.println("It's a must implemened method in this class");
        System.out.println("if we dont complete this method here then ");
        System.out.println("Either this class also abstract or we have to complete method ");
        System.out.println("Abstract Class we dont make Object cause its incomplete");

    }

    @Override
    public void detail2() {
        System.out.println("implementing method from interface");
    }
    // the question is do we need to implemends all methods of interface???????

    @Override // this is java annotation
    public void setFullName(String name1, String name2) {
        System.out.println("First parameter passed : "+name1);
        System.out.println("Second parameter Value: " + name2);
    }


    @Override
    public void mrthodforabstractClass() {
        super.mrthodforabstractClass();
        System.out.println("*********");
        System.out.println("From here its overriding in Abstract 2");
    }

    // this method must be completed here because only its implementing here



    @Override
    public void description(String first, String second, double z) {
        System.out.println(first);
        System.out.println(second);
        System.out.println("The value is : "+ z);
    }

    // below two method from InterfacePractice3 must implementing here
    @Override
    public int result1() {
        // accessing instance variable of extended class
        return (num1+num3);
    }

    @Override
    public int result1(int x, int y) {
        return (num3+num1)*x*y;
    }


    // copying from MainRevision to Abstract class in order to write new programs in Main revision
    // nothing Change from original program

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

