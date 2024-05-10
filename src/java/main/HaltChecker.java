public class HaltChecker {
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