package HomeWorkWeekDaysNov2018;

import java.io.*;

public class OutputStream {

    static int num1 = 10;
    String name1 = "Khan";

    public static void general(int x,String y){
        System.out.println("QA Engineer");
        System.out.printf("Hmmm the name is %s and %d",y, x);

    }
    public static void main(String[] args) {
        LearningSerialization obj1 = new LearningSerialization();
        obj1.introduction();
        obj1.age=obj1.age+num1;
        obj1.name = "Afnan Saeed";
        obj1.intr1= "Learninng java";
        try{
        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Saeed\\Desktop\\Afnan.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(obj1);
        out.close();
        fileOut.close();
            System.out.printf("Confirmed  Serilization");
        }
        catch(IOException e){
            e.printStackTrace();

        }













    }

}
