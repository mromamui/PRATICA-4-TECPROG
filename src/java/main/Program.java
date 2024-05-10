public abstract class Program {
    protected Program next;

    public void setNext(Program next) {
        this.next = next;
    }

    public abstract String run(String programName, int input);
}