import java.util.ArrayList;
import java.util.Collections;

public class MyClass {
    public static void main(String[] args) {
        ArrayList<String> myCars = new ArrayList<String>();
        myCars.add("Nissan");
        myCars.add("Hyundai");
        myCars.add("Maza");
        myCars.add("BMW");
        myCars.add("Audi");
        myCars.add("Mercedes");

        Collections.sort(myCars);

        for (String s : myCars) {
            System.out.println(s);
        }
    }
}
