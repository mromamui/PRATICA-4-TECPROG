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
        // Testing Reverser is tricky because it either enters an infinite loop or does nothing.
        // We can only test that it does not throw an exception when given a known program.
        assertDoesNotThrow(() -> Reverser.main(new String[]{"Countdown"}));
    }
}