import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class TestCodigo {
    @Test
    public void testCountdown() {
        Countdown countdown = new Countdown();
        String output = countdown.run("Countdown", 5);
        assertEquals("5\n4\n3\n2\n1\n0\nCountdown has reached zero.\n", output);
    }

    @Test
    public void testHaltChecker() {
        assertTrue(HaltChecker.willHalt("Countdown", 5));
        assertFalse(HaltChecker.willHalt("Countup", 5));
    }

    @Test
    public void testReverser() {
        // Probar Reverser es complicado porque o entra en un bucle infinito o no hace nada.
        // Solo podemos probar que no lanza una excepción cuando se le da un programa conocido.
        assertDoesNotThrow(() -> Reverser.main(new String[]{"Countdown"}));
    }
}