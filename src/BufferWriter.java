import java.io.*;

public class BufferWriter {

    public static void main(String[] args) {

        String text = "Use executeQuery when you want to retrieve data from MySQL (Select * from students) DML\n" +
                "    Use executeUpdate when we want to insert data to Mysql or Update or\n" +
                "    Delete in one word DDL commands.\n" +
                "    Execute is can use in any way However is traditionaly better to use ExeQuer or ExeUpd";

        try {
            FileOutputStream fl = new FileOutputStream("C:\\Users\\agaev\\Desktop\\JDBC.txt");
            BufferedOutputStream bf = new BufferedOutputStream(fl);

            byte b[] = text.getBytes();
            bf.write(b);
            bf.flush();
            fl.close();
            bf.close();

            System.out.println("Completed");



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
