import java.util.ArrayList;
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
        return "Producto:   " + primero + "   -> Precio: S/" + segundo;
    }
}
public class Contenedor<F, S> {
    private ArrayList<Par<F, S>> pares;
    public Contenedor() {
        pares = new ArrayList<>();
    }
    public void agregarPar(F primero, S segundo) {
        Par<F, S> nuevoPar = new Par<>(primero, segundo);
        pares.add(nuevoPar);
    }
    public Par<F, S> obtenerPar(int indice) {
        return pares.get(indice);
    }
    public ArrayList<Par<F, S>> obtenerTodosLosPares() {
        return pares;
    }

    public void mostrarPares() {
        for (Par<F, S> par : pares) {
            System.out.println(par);
        }
    }

    public static void main(String[] args) {

        Contenedor<String, Double> productos = new Contenedor<>();

        productos.agregarPar("Laptop", 2500.00);
        productos.agregarPar("Mouse", 80.00);
        productos.agregarPar("Teclado", 150.00);
        productos.agregarPar("Monitor", 900.00);

        System.out.println("TODOS LOS PRODUCTOS:");
        productos.mostrarPares();

        System.out.println("\nPRODUCTO EN LA POSICION 1:");
        System.out.println(productos.obtenerPar(1));

        System.out.println("\nLISTA COMPLETA:");
        System.out.println(productos.obtenerTodosLosPares());
    }
}