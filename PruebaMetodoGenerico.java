class InvalidSubscriptException extends Exception {
    public InvalidSubscriptException(String mensaje) {
        super(mensaje);
    }
}
public class PruebaMetodoGenerico {
    public static <E> void imprimirArreglo(E[] arregloEntrada) {
        for (E elemento : arregloEntrada) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }
    public static <E> int imprimirArreglo(
            E[] arregloEntrada,
            int subindiceInferior,
            int subindiceSuperior) throws InvalidSubscriptException {
        if (subindiceInferior < 0
                || subindiceInferior >= arregloEntrada.length
                || subindiceSuperior < 0
                || subindiceSuperior > arregloEntrada.length) {
            throw new InvalidSubscriptException(
                    "Los índices están fuera del rango permitido."
            );
        }
        if (subindiceSuperior <= subindiceInferior) {
            throw new InvalidSubscriptException(
                    "El subindiceSuperior debe ser mayor que el subindiceInferior."
            );
        }
        int cantidadElementos = 0;
        for (int i = subindiceInferior; i < subindiceSuperior; i++) {
            System.out.printf("%s ", arregloEntrada[i]);
            cantidadElementos++;
        }
        System.out.println();

        return cantidadElementos;
    }
    public static void main(String[] args) {
        Integer[] arregloInteger = {1, 2, 3, 4, 5, 6};
        Double[] arregloDouble = {
            1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7
        };
        Character[] arregloCharacter = {
            'H', 'O', 'L', 'A'
        };
        System.out.println("El arreglo arregloInteger contiene:");
        imprimirArreglo(arregloInteger);
        System.out.println("\nEl arreglo arregloDouble contiene:");
        imprimirArreglo(arregloDouble);
        System.out.println("\nEl arreglo arregloCharacter contiene:");
        imprimirArreglo(arregloCharacter);
        try {
            System.out.println("\nParte del arreglo Integer:");
            int cantidad = imprimirArreglo(arregloInteger, 1, 4);
            System.out.println("Cantidad de elementos impresos: " + cantidad);
            System.out.println("\nParte del arreglo Double:");
            cantidad = imprimirArreglo(arregloDouble, 2, 6);
            System.out.println("Cantidad de elementos impresos: " + cantidad);
            System.out.println("\nParte del arreglo Character:");
            cantidad = imprimirArreglo(arregloCharacter, 1, 3);
            System.out.println("Cantidad de elementos impresos: " + cantidad);
        } catch (InvalidSubscriptException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}