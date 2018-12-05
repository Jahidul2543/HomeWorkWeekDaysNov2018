package HomeWorkWeekDaysNov2018;

import java.io.*;
public class Deserilization {

    public static void main(String[] args)throws ClassNotFoundException,IOException {

        LearningSerialization obj2 = null;
        try{
            FileInputStream fileIn = new FileInputStream("C:\\Users\\Saeed\\Desktop\\Afnan.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            obj2= (LearningSerialization) in.readObject();
            in.close();
            fileIn.close();
        }
        finally {
            System.out.println(obj2.age);
            obj2.introduction();
            System.out.println(obj2.intr1);;

        }





    }
}
