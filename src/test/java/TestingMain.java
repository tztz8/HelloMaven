import org.junit.jupiter.api.Test;
import tech.tftinker.helloworld.Main;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class TestingMain {
    @Test
    public void testOutputOfMain() {
        String outputText = "Hello World!\n";

        PrintStream outputStream = System.out;

        ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));

        Main.main(new String[0]);

        assertEquals(outputText, myOut.toString().replace("\r",""));

        System.setOut(outputStream);
    }

    @Test
    public void thisTestWillFail() {
        fail("This test will Fail");
    }
}
