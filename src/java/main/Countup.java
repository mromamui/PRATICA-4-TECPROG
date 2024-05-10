public class Countup extends Program {


    // Cuenta hacia arriba desde un número de entrada indefinidamente.
    @Override
    public String run(String programName, int input) {
        StringBuilder output = new StringBuilder();
        if (programName.equals("Countup")) {
            int count = input;
            while (true) {
                output.append(count).append("\n");
                if (count == 0) {
                    output.append("Countup has started.\n");
                }
                count++;
            }
        } else if (next != null) {
            output.append(next.run(programName, input));
        }
        return output.toString();
    }
}