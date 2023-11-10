public class Main{
    public static void main (String[] args) {
        Arbol<String> arbol = new Arbol("A", false);

        NodoArbol<String> nodoB = new NodoArbol("B");
        NodoArbol<String> nodoC = new NodoArbol("C"); 
        NodoArbol<String> nodoD = new NodoArbol("D");

        arbol.agregarNodoArbol(arbol.obtenerRaiz(), nodoB);
        arbol.agregarNodoArbol(arbol.obtenerRaiz(), nodoC);
        arbol.agregarNodoArbol(arbol.obtenerRaiz(), nodoD);
        
        NodoArbol<String> nodoE = new NodoArbol("E");
        NodoArbol<String> nodoF = new NodoArbol("F");
        
        arbol.agregarNodoArbol(nodoB, nodoE);
        arbol.agregarNodoArbol(nodoB, nodoF);

        arbol.imprimirArbol(Recorrido.PREFIJO);
        arbol.imprimirArbol(Recorrido.INFIJO);
        arbol.imprimirArbol(Recorrido.POSFIJO);
    }
}