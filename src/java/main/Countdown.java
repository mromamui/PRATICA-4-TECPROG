public class Countdown extends Program {

    // Cuenta hacia atrás desde un número de entrada hasta cero.
    @Override
    public String run(String programName, int input) {
        StringBuilder output = new StringBuilder();
        if (programName.equals("Countdown")) {
            int count = input;
            while (count >= 0) {
                output.append(count).append("\n");
                if (count == 0) {
                    output.append("Countdown has reached zero.\n");
                }
                count--;
            }
        } else if (next != null) {
            output.append(next.run(programName, input));
        }
        return output.toString();
    }
}