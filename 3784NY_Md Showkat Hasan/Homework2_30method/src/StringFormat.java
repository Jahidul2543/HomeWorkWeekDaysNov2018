
public class StringFormat

{

    public static void main(String args[])

    {

        String name="Java";

        String sf1=String.format("Name is %s",name);
        String sf2=String.format("Value is %f",32.33434);
        String sf3=String.format("Value is %32.12f",32.33434);

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
    }
}

//sf means string format