import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTest {

    @Test

    public  void shouldReturn(){
        UnitTest obj = new UnitTest();
        assertEquals("Hello world",obj.helloWorld());

    }

    private String helloWorld() {
        return "Hello world";
    }

    public static void main(String[] args) {


    }
}
