

public class stringcheckForEnding
{


    static String name = "Hey my name is Hasan";

    public static String stringcheckForEnding(String word, char letter)

    {

        if ((Boolean) word.endsWith(String.valueOf(letter))) {
            System.out.println("Yes it ended with letter" + " " + letter);
        } else {
            System.out.println("It didn't ended with letter" + " " + letter);
        }
        return word;
    }

    public static void main(String[] args) {
        System.out.println(stringcheckForEnding("Hasan", 'n'));
    }
}