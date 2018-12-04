package SteringM;

public class EnumTest2 {

    // A simple enum example where enum is declared
    // outside any class (Note enum keyword instead of
// class keyword)
    enum Color
    {
        RED, GREEN, BLUE;
    }

    public class Test
    {
        // Driver method
        public  void main(String[] args)
        {
            Color c1 = Color.RED;
            System.out.println(c1);
        }
    }
}
