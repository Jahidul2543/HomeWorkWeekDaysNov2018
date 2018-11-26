package basic;

public class NumberDivisible extends TwoNumberInput {

    public static void main(String[] args) {

        TwoNumberInput obj1 = new TwoNumberInput();

        obj1.TwoNumberInput();
        System.out.printf("Number divisble by %2d in first  100\n", obj1.x);
        for (int i = 1; i <= 100; i++) {

            if (i % obj1.x == 0) {
                System.out.print(" " + i + " ");

            }

        }
        System.out.println();
        System.out.printf("Number divisble by %2d in first  100\n", obj1.y);

        for (int j = 1; j <= 100; j++) {

            if (j % obj1.y == 0) {
                System.out.print(" " + j + " ");

            }

            }
        System.out.println();
        System.out.printf("Number divisble by both %2d & %2d in first  100\n",obj1.x, obj1.y);

        for (int z = 1;z<=100;z++){
            if(z%obj1.x==0 && z%obj1.y ==0){
                System.out.print(" "+z+" ");
            }

        }
    }
}