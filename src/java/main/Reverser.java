public class Reverser {
    public static void main(String[] args) {
        String program = "Countdown";

        if (args.length > 0) {
            program = args[0];
        }

        if (HaltChecker.willHalt(program, 0)) {
            System.out.println("Entering infinite loop");
            while (true) {}
        } else {
            System.out.println("Terminating immediately");
        }
    }
}