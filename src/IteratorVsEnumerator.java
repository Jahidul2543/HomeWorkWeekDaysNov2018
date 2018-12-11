import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorVsEnumerator {

    public static void main(String[] args) {

        ArrayList nums = new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Iterator it = nums.iterator();

        while (it.hasNext()){

            int i = (int) it.next();

            if (i%3!=0){

                it.remove();
            }

        }

        System.out.println(nums);
    }
}
