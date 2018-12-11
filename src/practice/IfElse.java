package practice;

public class IfElse {
    public static void main(String[] args) {
        boolean condition = false;
        if (condition) {
            System.out.println("condition is true");
        } else {
            System.out.println("condition is false");
        }


        int boyAge = 18;
        int girlAge = 68;
        if (boyAge >= 18 && girlAge <= 30) {
            System.out.println("They can get toegther");
        } else {
            System.out.println("They cannot get together");
        }
    }
}
