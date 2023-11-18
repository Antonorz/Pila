public class NodoArbol <T> {
  private T dato;
  private boolean esBinario = false;
  private NodoArbol <T> primerHijo;
  private NodoArbol <T> siguienteHermano;

  public NodoArbol (T dato) {
    this.dato = dato;
    primerHijo = null;
    siguienteHermano = null;
  }
  /*
  Agregar un hijo: Se introduce un nodo dentro de un arbol, si el primer hijo es nulo quiere decir que nuestro arbol aun necesita de un nodo hijo, en caso contrario 
  el nodo a agregarse pasa a considerarse hermano, pues ya hay hijos.
  Despues se detecta si el arbol es binario o no: Si el arbol es binario existira un limite para agregar nodos hijos, pues en binarios el maximo de hijos 
  son dos, si no es binario no existe un limite de hermanos y podemos agregar los que sean.
   */
  public void agregarHijo (NodoArbol <T> hijo) {
    if (primerHijo == null) {
      primerHijo = hijo;
    } else {
      NodoArbol<T> hermano = this.primerHijo;

      if (esBinario) {
        if (hermano.siguienteHermano != null) {
          System.err.println("El nodo ya tiene un hijo, no se debe agregar " + hijo.getDato());	
        } else {
          hermano.siguienteHermano = hijo;
        }
      } else {
        while (hermano.siguienteHermano != null) {
          hermano = hermano.siguienteHermano;
        }
        hermano.siguienteHermano = hijo;
      }      
    }
  }
  
  /*
   * Obtiene el primer hijo del nodo actual.
   */
  public NodoArbol<T> obtenerPrimerHijo () {
    return primerHijo;
  }
  /*
   * Obtiene el siguiente hermano.
   */
  public NodoArbol<T> obtenerSiguienteHermano () {
    return siguienteHermano;
  }
  /**
   * Setters y Getters
   */
  public T getDato () {
    return dato;
  }

  public boolean esBinario () {
    return esBinario;
  }

  public void setEsBinario (boolean esBinario) {
    this.esBinario = esBinario;
  }
  /*
   * Imprime los nodos en prefijo.
   */
  public void imprimirEnPrefijo() {
    System.out.print(dato + "\t");
    NodoArbol<T> hijo = primerHijo;

    while (hijo != null) {
      hijo.imprimirEnPrefijo();
      hijo = hijo.siguienteHermano;
    }
  }
  /*
   * Imprime los nodos en infijo.
   */
  public void imprimirEnInfijo() {
    NodoArbol<T> hijo = primerHijo;

    if (hijo != null) {
      hijo.imprimirEnInfijo();
    }

    System.out.print(dato + "\t");
    while (hijo != null) {
      hijo = hijo.siguienteHermano;
      if (hijo != null) {
        hijo.imprimirEnInfijo();
      }
    }
  }
  /*
   * Imprime los nodos en posfijo.
   */
  public void imprimirEnPosfijo() {
    NodoArbol<T> hijo = primerHijo;

    while (hijo != null) {
      hijo.imprimirEnPosfijo();
      hijo = hijo.siguienteHermano;
    }

    System.out.print(dato + "\t");
  }
}
