import java.util.Scanner;

public class BasicCalculator {

    public static void main (String [] args) {


        double fnum, snum, answer;

        Scanner jewel = new Scanner(System.in);

        System.out.println("enter  fnum: ");
        fnum = jewel.nextDouble();
        System.out.println("enter snum: ");
        snum= jewel.nextDouble();

        answer = fnum + snum;
        System.out.println(answer);


    }





}
