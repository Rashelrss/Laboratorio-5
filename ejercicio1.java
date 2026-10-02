class Par<F, S> {
    private F primero;
    private S segundo;
    public Par(F primero, S segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }
    public F getPrimero() {
        return primero;
    }
    public S getSegundo() {
        return segundo;
    }
    public void setPrimero(F primero) {
        this.primero = primero;
    }
    public void setSegundo(S segundo) {
        this.segundo = segundo;
    }
    @Override
    public String toString() {
        return "(Primero: " + primero + ", Segundo: " + segundo + ")";
    }
}
public class ejercicio1 {
    public static void main(String[] args) {
        Par<String, Integer> par = new Par<>("Emilhy", 20);
        System.out.println("Par original:");
        System.out.println(par);
        par.setPrimero("Java");
        par.setSegundo(100);
        System.out.println("\nPar modificado:");
        System.out.println(par);
        System.out.println("\nPrimer elemento: " + par.getPrimero());
        System.out.println("Segundo elemento: " + par.getSegundo());
    }
}