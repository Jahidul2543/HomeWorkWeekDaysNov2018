

public class NewClass

{
    public static void main(String[] args)

    {
        int x = 10;
        while(x > 4)

        {
            System.out.println(x);
            x--; //decrement by 1 here
            if (x == 5)

            {
                x += 5; //when x reaches 5 increase value by 5, so the whole thing repeats again
            }
        }
    }
}