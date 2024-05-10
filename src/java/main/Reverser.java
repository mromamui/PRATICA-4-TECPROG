public class Reverser {
    public static void main(String[] args) {
        String program = args[0];
        if (HaltChecker.willHalt(program, 0)) {
            while (true) {}
        }
    }
}