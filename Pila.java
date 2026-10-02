public class Pila<E> {
    private final int tamanio;
    private int superior;
    private E[] elementos;
    public Pila() {
        this(10);
    }
    public Pila(int s) {
        tamanio = s > 0 ? s : 10;
        superior = -1;
        elementos = (E[]) new Object[tamanio];
    }
    public void push(E valorAMeter) {
        if (superior == tamanio - 1) {
            throw new RuntimeException("La Pila esta llena");
        }
        elementos[++superior] = valorAMeter;
    }
    public E pop() {
        if (superior == -1) {
            throw new RuntimeException("La Pila esta vacia");
        }
        return elementos[superior--];
    }
    public boolean esIgual(Pila<E> otraPila) {
        if (this.superior != otraPila.superior) {
            return false;
        }
        for (int i = 0; i <= superior; i++) {
            if (elementos[i] == null && otraPila.elementos[i] == null) {
                continue;
            }
            if (elementos[i] == null || otraPila.elementos[i] == null) {
                return false;
            }
            if (!elementos[i].equals(otraPila.elementos[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Pila<Integer> pila1 = new Pila<>(5);
        Pila<Integer> pila2 = new Pila<>(5);
        pila1.push(10);
        pila1.push(20);
        pila1.push(30);
        pila2.push(10);
        pila2.push(20);
        pila2.push(30);
        System.out.println("¿Las pilas son iguales? "
                + pila1.esIgual(pila2));
        pila2.pop();
        pila2.push(40);
        System.out.println("¿Las pilas son iguales después del cambio? "
                + pila1.esIgual(pila2));
    }
}