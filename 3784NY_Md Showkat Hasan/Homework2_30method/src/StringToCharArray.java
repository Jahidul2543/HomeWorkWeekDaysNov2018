

public class StringToCharArray

{
    public static void main(String args[])

    {
        String s1="Example of String to Char Array";
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++)

        {
            System.out.print(ch[i]);
        }
    }
}