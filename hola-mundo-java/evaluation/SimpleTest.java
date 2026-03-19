import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class SimpleTest {

    @Test
    public void testSalida() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);

        HelloWorld.main(new String[]{});

        System.out.flush();
        System.setOut(old);

        String salida = baos.toString().trim();
        assertEquals("Hola, soy Maria!", salida);
    }
}