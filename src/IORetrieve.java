import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class IORetrieve {



    public static void main(String[] args) {

        try {
            FileInputStream fl = new FileInputStream("Specify the Path to file here ");

            int i;

            while((i=fl.read())!=-1){

                System.out.print(((char)i));
            }
            System.out.println();
            
            fl.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
