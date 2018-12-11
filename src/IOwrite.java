import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOwrite {

static String text = "    Use executeQuery when you want to retrieve data from MySQL (Select * from students) DML\n" +
        "    Use executeUpdate when we want to insert data to Mysql or Update or\n" +
        "    Delete in one word DDL commands.\n" +
        "    Execute is can use in any way However is traditionaly better to use ExeQuer or ExeUpd";



    public static void main(String[] args) {

        try {
            FileOutputStream fl = new FileOutputStream("C:\\Users\\agaev\\Desktop\\JDBC.txt");
            byte b[] = text.getBytes();
            fl.write(b);
            fl.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
