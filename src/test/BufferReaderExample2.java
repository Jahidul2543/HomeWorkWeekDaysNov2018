package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample2 {
    public static void main(String[] args) throws IOException {

       FileReader fr = new FileReader("/Users/rashedarnob/desktop/buff/pnt3.txt");
       BufferedReader br = new BufferedReader(fr);

       int i;
       while((i= br.read())!=-1) {
           System.out.print((char)i);
       }

    }
}
