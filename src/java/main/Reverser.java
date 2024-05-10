public class Reverser {
    public static void main(String[] args) {
        if (args.length > 0) {
            String program = args[0];
            if (HaltChecker.willHalt(program, 0)) {
                System.out.println("Entering infinite loop");
                while (true) {}
            } else {
                System.out.println("Terminating immediately");
            }
        }
    }
}