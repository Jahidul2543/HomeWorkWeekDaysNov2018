package practice;

public class Fibonacci {
    public static void main(String[] args) {
        int i = 1;
        int j = 0;
        System.out.println("40 Fibonacci numbers: ");
        for (int k = 1; k <= 40; k++) {
            int sum = i + j;
            i = j;
            j = sum;
            System.out.println(sum + "");
        }
    }
}
