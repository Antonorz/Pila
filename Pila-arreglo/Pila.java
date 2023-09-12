package Pila_arreglo;

/**
 *
 * @author Anton
 */
public class Pila {

    private Nodo cima;
    private int tamanio;
    //Insertar un elemento en la cima.
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
    //Quitar el elemento de la cima.
    public int quitar() {
        int datoCima = cima.getDato();
        cima = cima.getNodo();
        tamanio--;
        return datoCima;
    }
    //Comprobar si una pila está vacía
    public boolean estaVacia() {
        return cima == null;
    }
    //Vaciar pila
    public void vaciar() {
        cima = null;
        tamanio = 0;
    }
    //Obtener el elemento que está en la cima de la pila
    public int obtenerCima() {
        return cima.getDato();
    }
    //Obtener el tamaño de la pila
    public int getTamanio() {
        return tamanio;
    }

}
