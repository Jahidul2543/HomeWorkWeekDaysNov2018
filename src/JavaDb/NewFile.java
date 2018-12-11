package JavaDb;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class  NewFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter fr=new FileWriter("filename.txt");//write to the file that we created above
            fr.write("I am writing to the file that we created");
            fr.close();

            File myFile=new File("filename.txt");
            Scanner myScanner=new Scanner(myFile);//Using scanner to read from file
            while (myScanner.hasNextLine()){
                String data=myScanner.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }finally {
            System.out.println("Code executed no matter what");
        }
    }
}



