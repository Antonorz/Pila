package Pila_arreglo;

/**
 *
 * @author Anton
 */

public class Nodo {
    //Como atributos privados un entero llamado dato y un Nodo llamado nodo.
    private Integer dato;
    private Nodo nodo;
    //Un constructor que inicialice a dato y a siguiente como nulo.
    public Nodo() {
        this.dato = null;
        this.nodo = null;
    }
    //Setters y getters para ambos atributos.
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    } 
]
