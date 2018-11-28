package main;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] anArray;

        anArray = new int[4];

        anArray[1] = 5;
        anArray[2] = 6;
        anArray[3] = 7;
        anArray[0] = 8;

        System.out.println("Element at index 1: " + anArray [1]);
        System.out.println("Element at index 2: " + anArray [2]);
        System.out.println("Element at index 3: " + anArray [3]);
        System.out.println("Element at index 0: " + anArray [0]);
    }

}
