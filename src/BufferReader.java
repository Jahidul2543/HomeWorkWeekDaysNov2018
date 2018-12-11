import java.io.*;

public class BufferReader {


    public static void main(String[] args) {

        try {
            FileInputStream fl = new FileInputStream("C:\\Users\\agaev\\Desktop\\JDBC.txt");
            BufferedInputStream bf = new BufferedInputStream(fl);

            int i;

            while ((i = bf.read())!=-1){

                System.out.print((char)i);
            }

            fl.close();
            bf.close();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
