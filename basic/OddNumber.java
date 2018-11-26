package basic;

public class OddNumber {

    public static void main(String[] args) {
            int z =0;
        for(int i = 1; i<=100;i++){
            if(i%2> 0){
                z++;
                System.out.printf("%2d) %d\n",z,i);

            }

        }
    }
}
