public class Main {
    public static void main(String[] args) {
        String programName = "Countdown";
        int input = 10;

        if (args.length > 1) {
            programName = args[0];
            input = Integer.parseInt(args[1]);
        }

        Program countdown = new Countdown();
        Program countup = new Countup();
        countdown.setNext(countup);

        String output = countdown.run(programName, input);
        System.out.println(output);
    }
}