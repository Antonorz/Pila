package Pila_arreglo;

/**
 *
 * @author Anton
 */
public class Main {
    public static void main(String[] args) {
        //Debe instanciar a la clase Pila.
        Pila pila = new Pila();
        //Se insertarán los números 14, 27, 1, 15, 10, 90, 71, 37, 2, 48. No hay necesidad de leerlos mediante consola.
        int[] numeros = {14, 27, 1, 15, 10, 90, 71, 37, 2, 46};
        for (int num : numeros) {
            pila.insertar(num);
        }
        //Se imprimirá el tamaño de la Pila.
        System.out.println("Tamanio de la Pila: " + pila.getTamanio() + "\n");
        //Se quitarán 4 elementos.
        for (int i = 0; i < 4; i++) {
            pila.quitar();
        }
        //Se imprimirá el elemento de la cima de la pila.
        System.out.println("Elemento de la cima de la pila: " + pila.obtenerCima() + "\n");
        //Se vaciará la pila.
        pila.vaciar();
        //Se imprimirá si la pila está vacía.
        System.out.println("Estado de la pila: " 
                + (pila.estaVacia()? "Vacia" : "No esta vacia"));
    }
}
