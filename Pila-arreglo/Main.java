package Pila_arreglo;

/**
 *
 * @author Anton
 */
public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();

        int[] numeros = {14, 27, 1, 15, 10, 90, 71, 37, 2, 46};
        for (int num : numeros) {
            pila.insertar(num);
        }
        
        System.out.println("Tamanio de la Pila: " + pila.getTamanio() + "\n");
        
        for (int i = 0; i < 4; i++) {
            pila.quitar();
        }
        
        System.out.println("Elemento de la cima de la pila: " + pila.obtenerCima() + "\n");
        
        pila.vaciar();
        
        System.out.println("Pila vacia?" 
                + (pila.estaVacia()? "Si, vacia" : "No esta vacia"));
    }
}
