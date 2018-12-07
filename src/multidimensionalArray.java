public class multidimensionalArray {
    public static void main (String [] args) {

        int [] [] myArrys = {{1,2,3,4},{5,6,7,8}};
        int[] [] myArrys2 = {{9,10,11,12},{13}, {14,15,17}};

        System.out.println("my first arrys are: ");
        display(myArrys);
        System.out.println("my second arrys are: ");

    }

    public static void display(int x[][]) {

        for (int row =0; row<x.length; row++) {

            for(int column=0; column<x[row].length; column++){

                System.out.print(x[row][column]);
            }

            System.out.println();

        }



    }

}
