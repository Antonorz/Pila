package Pila_arreglo;

/**
 *
 * @author Anton
 */
public class Pila {

    private Nodo cima;
    private int tamanio;

    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        if (cima == null) {
            cima = nuevoNodo;
        } else {
            nuevoNodo.setNodo(cima);
            cima = nuevoNodo;
        }
        tamanio++;
    }

    public int quitar() {
        int datoCima = cima.getDato();
        cima = cima.getNodo();
        tamanio--;
        return datoCima;
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public void vaciar() {
        cima = null;
        tamanio = 0;
    }
    
    public int obtenerCima() {
        return cima.getDato();
    }
    
    public int getTamanio() {
        return tamanio;
    }

}
