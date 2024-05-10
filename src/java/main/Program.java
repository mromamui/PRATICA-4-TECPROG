public abstract class Program {

    protected Program next;

    // El método setNext establece el siguiente programa en la cadena de responsabilidad.
    public void setNext(Program next) {
        this.next = next;
    }

    // El método run es un método abstracto que debe ser implementado por las subclases.
    // Ejecuta un programa específico.
    public abstract String run(String programName, int input);
}