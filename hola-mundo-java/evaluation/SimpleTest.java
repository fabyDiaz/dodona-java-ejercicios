package evaluation;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

public class SimpleTest {

    @Test
    public void testSalida() throws Exception {
        // Redirigir System.out para capturar la salida
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);

        // Ejecutar el main del estudiante
        HelloWorld.main(new String[]{});

        // Restaurar System.out
        System.out.flush();
        System.setOut(old);

        String salida = baos.toString().trim();
        assertEquals("Hola, soy Maria!", salida);
    }
}