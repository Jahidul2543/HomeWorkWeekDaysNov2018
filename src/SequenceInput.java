import java.io.*;

public class SequenceInput {

    public static void main(String[] args) {

        try {
            FileInputStream fl = new FileInputStream("C:\\Users\\agaev\\Desktop\\JDBC.txt");
            FileInputStream fl1 = new FileInputStream("C:\\Users\\agaev\\Desktop\\MongoDb.txt");
            FileOutputStream fl2 = new FileOutputStream("C:\\Users\\agaev\\Desktop\\Hamali.txt");
            SequenceInputStream sis = new SequenceInputStream(fl,fl1);
            int i;

            while((i = sis.read())!=-1){



                fl2.write(i);
            }
            sis.close();
            fl.close();
            fl1.close();
            fl2.close();


            System.out.println("Completed");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
