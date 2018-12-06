package HomeWorkWeekDaysNov2018.revision;

public class ScopeOfStaticWord2 extends ScopeOfStaticWord {

    static int a = 25;
    static int b = 17;

    int c2 = 18;
    int d2 = 15;

    // the word public removed to see the behavior
    static void subtraction1(){
        // access provided only on class variable because of static method
        System.out.println("The result is : "+(a -b) );
    }

    public void subtraction2(){
        // below two identifier used, one is static variable and other is instance
        System.out.println("The result is : "+ (a-c));
        System.out.println("The result is : "+ (c2-d2));
    }

    public static void main(String[] args) {
        // obj one created from ScopeOfStaticWord
        ScopeOfStaticWord obj1 = new ScopeOfStaticWord();

        //Obj2 is creating from ScopeOfStaticWord2 which extending ScopeOfStaticWord
        ScopeOfStaticWord2 obj2 = new ScopeOfStaticWord2();

        // below we see the behavior of static variable and static method
        // first we call obj1
        // we can call only instance variable with obj1 that is c and d.
        // access not granted to static variable that is a and b
        System.out.println("The result is : " + (obj1.c+ obj1.d));
        System.out.println("***********");
        obj1.addition3();
        System.out.println("***********");
        // obj1 is accessing static methods but its showing highlighted
//        obj1.addition2();
//        obj1.addition1(); // we can access these in intellij but better to use with class
//        System.out.println(obj1.a); // intellij showing message Using Via instance reference
        System.out.println("Obj2 started from here");



        //using obj2 who is inheriting properties of other class

        // names of static variable is same in both classes.
//        System.out.println("Forcefully printing its class variable "+obj2.a);
        obj2.addition3();
//        System.out.println("below calling addition2 which is static method, its printing but not good practice");

//        obj2.addition2();
        obj2.subtraction2();


    }


}
