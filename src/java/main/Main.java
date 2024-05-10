public class Main {
    public static void main(String[] args) {
        if (args.length > 1) {
            Program countdown = new Countdown();
            Program countup = new Countup();
            countdown.setNext(countup);

            String output = countdown.run(args[0], Integer.parseInt(args[1]));
            System.out.println(output);
        } else {
            System.out.println("No se proporcionaron suficientes argumentos");
        }
    }
}