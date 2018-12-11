import java.io.*;

public class SequenceOutput {

    public static void main(String[] args) {

        try {
            FileInputStream fl = new FileInputStream("C:\\Users\\agaev\\Desktop\\JDBC.txt");
            FileInputStream fl1 = new FileInputStream("C:\\Users\\agaev\\Desktop\\mongoDb.txt");
            SequenceInputStream sis = new SequenceInputStream(fl, fl1);

            int i;

            while ((i=sis.read())!=-1){
                System.out.print((char)i);
            }

            sis.close();
            fl.close();
            fl1.close();

            System.out.println("Completed");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
