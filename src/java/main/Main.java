public class Main {
    public static void main(String[] args) {
        Program countdown = new Countdown();
        Program countup = new Countup();
        countdown.setNext(countup);

        String output = countdown.run(args[0], Integer.parseInt(args[1]));
        System.out.println(output);
    }
}