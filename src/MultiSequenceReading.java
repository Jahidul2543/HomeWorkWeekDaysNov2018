import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class MultiSequenceReading {

    public static void main(String[] args) {

        try {

            FileInputStream fl = new FileInputStream("C:\\Users\\agaev\\Desktop\\MongoDb.txt");
            FileInputStream fl1 = new FileInputStream("C:\\Users\\agaev\\Desktop\\JDBC.txt");
            FileInputStream fl2 = new FileInputStream("C:\\Users\\agaev\\Desktop\\Hamali.txt");
            FileInputStream fl3 = new FileInputStream("C:\\Users\\agaev\\Desktop\\Things to cover.txt");


            Vector v = new Vector();

            v.add(fl);
            v.add(fl1);
            v.add(fl2);
            v.add(fl3);


            Enumeration e = v.elements();

            SequenceInputStream sis = new SequenceInputStream(e);


            int i;

            while ((i = sis.read())!=-1){

                System.out.print((char)i);
            }

            sis.close();
            fl1.close();
            fl.close();
            fl3.close();


            System.out.println("Completed");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
