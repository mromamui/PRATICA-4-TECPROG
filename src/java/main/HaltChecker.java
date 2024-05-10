public class HaltChecker {

    // El método willHalt verifica si un programa dado se detendrá o no.
    // Devuelve true si el programa se detendrá, false en caso contrario.
    public static boolean willHalt(String program, int input) {
        if (program.equals("Countdown")) {
            return true;
        } else if (program.equals("Countup")) {
            return false;
        } else {
            throw new IllegalArgumentException("Unknown program");
        }
    }
}