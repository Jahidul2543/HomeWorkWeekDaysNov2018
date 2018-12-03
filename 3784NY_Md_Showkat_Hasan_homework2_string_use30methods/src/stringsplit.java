


public class stringsplit {


    public static void main(String args[])
    {
        String str = "Java@is@object@oriented@programming@language";
        String[] arrOfStr = str.split("@", 6);

        for (String a : arrOfStr)
            System.out.println(a);

        System.out.println("Result: here text is split 6 times by '@' ");
    }
}


//Java program to demonstrate working of split(regex,limit) with small limit.