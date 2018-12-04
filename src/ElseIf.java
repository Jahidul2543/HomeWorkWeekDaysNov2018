public class ElseIf {
    public static void main(String[] args) {
        int marks=70;
        if(marks<70){
            System.out.println("Failing grade");
        }
        else if(marks<=70){
            System.out.println("Barely passed");
        }
        else if (marks>70 && marks<80){
            System.out.println("grade is D");

        }

        else if (marks >80 && marks <90){
            System.out.println("Grade is B");
        }

        else{
            System.out.println("You are genius");
        }
    }
}
