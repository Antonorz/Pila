public class Arbol <T> {
  /*Al crear nuestro arbol le agregamos un nodo raiz y decidiremos si nuestro arbol es binario o no por medio de un constructor. */
  private NodoArbol <T> raiz;
  private boolean esBinario = false;
  /*Si el arbol es binario nuestro arbol tendra otro tipo de comportamiento (vease la clase NodoArbol para mas detalle). */
  public Arbol (T dato, boolean esBinario) {
    raiz = new NodoArbol <T> (dato);
    raiz.setEsBinario(esBinario);
    this.esBinario = esBinario;
  }
  /*Se obtiene la raiz del arbol. */
  public NodoArbol <T> obtenerRaiz() {
    return raiz;
  }
  /*Detecta si el arbol es binario o no. */
  public boolean esBinario() {
    return esBinario;
  }
  /*Se agrega un nodo a nuestro arbol: Se inserta un nodo raiz y el nodo que vamos a agregar. Si nuestro arbol es binario, se agrega el nodo junto a la información
  de que el arbol con que tratamos es binario. Independiente de si es o no binario, se le agrega un nodo hijo por el metodo agregarHijo; segun la identidad de nuestro
  arbol (si es binario o no) el metodo actuara de diferente forma.*/
  public void agregarNodoArbol(NodoArbol <T> nodoRaiz, NodoArbol <T> nodoAgregado) {
    if (esBinario) {
      nodoAgregado.setEsBinario(esBinario);
    }

    nodoRaiz.agregarHijo(nodoAgregado);
  }
  /*Imprimira el arbol de forma prefija, infija o posfija segun el texto que ingresemos. Cuando introduzcamos un texto dentro de un enum se buscara la
  posicion en donde esta este texto y decidida de acuerdo a su posicion que metodo va a ejecutar.*/
  public void imprimirArbol(Recorrido recorrido) {
    switch (recorrido.ordinal()) {
      case 0:
        System.out.println("Prefijo: ");
        raiz.imprimirEnPrefijo();
        break;

      case 1:
        System.out.println("\nInfijo: ");
        raiz.imprimirEnInfijo();
        break;

      case 2:
        System.out.println("\nPosfijo: ");
        raiz.imprimirEnPosfijo();
        break;
    
      default:
        break;
    }
  }
}