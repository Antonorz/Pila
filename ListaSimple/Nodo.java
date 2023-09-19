public class Nodo {
  private int dato;
  private Nodo primerNodo;
  public Nodo(int dato) {
    this.dato = dato;
    this.primerNodo = null;
  }
  public int getDato() {
    return dato;
  }
  public void setDato(int dato) {
    this.dato = dato;
  }
  public Nodo getSiguiente() {
    return primerNodo;
  }
  public void setSiguiente(Nodo siguiente) {
    this.primerNodo = siguiente;
  }
}
