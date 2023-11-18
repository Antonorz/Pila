public class Main {
    public static void main(String[] args) {
        //Orden 4
        ArbolB arbolB = new ArbolB(4);

        //Insertar
        arbolB.insertar(arbolB, 7);
        arbolB.insertar(arbolB, 16);
        arbolB.insertar(arbolB, 1);
        arbolB.insertar(arbolB, 2);
        arbolB.insertar(arbolB, 5);

        // Imprimir el arbol B con nodos insertados
        System.out.println("Arbol B con nodos insertados:");
        arbolB.imprimir(arbolB.raiz);
        System.out.println();

        // Buscar nodos
        System.out.println("Buscando nodo (10):");
        arbolB.imprimirNodoEspecifico(arbolB, 10);
        System.out.println();
        
        System.out.println("Buscando nodo (1):");
        arbolB.imprimirNodoEspecifico(arbolB, 1);
        System.out.println();


        // Eliminar una llave
        System.out.println("Arbol B antes de eliminar la llave 1:");
        arbolB.imprimir(arbolB.raiz);
        System.out.println("");
        arbolB.eliminarDato(arbolB, 1);
        System.out.println();
        System.out.println("Arbol B despues de eliminar la llave 1:");
        arbolB.imprimir(arbolB.raiz);
        System.out.println();
        
        arbolB.insertar(arbolB, 3);
        arbolB.insertar(arbolB, 4);
        arbolB.insertar(arbolB, 6);
        arbolB.insertar(arbolB, 8);


        // Imprimir el arbol B con nodos insertados
        System.out.println("Arbol B con nodos insertados:");
        arbolB.imprimir(arbolB.raiz);
        System.out.println();
        
        arbolB.insertar(arbolB, 11);
        arbolB.insertar(arbolB, 12);
        arbolB.insertar(arbolB, 13);
        arbolB.insertar(arbolB, 14);
        
        // Imprimir el arbol B con nodos insertados
        System.out.println("Arbol B con MAS nodos insertados:");
        arbolB.imprimir(arbolB.raiz);
        System.out.println();
        
        // Buscar nodos
        System.out.println("Buscando nodo (8):");
        arbolB.imprimirNodoEspecifico(arbolB, 8);
        System.out.println();
        
        System.out.println("Buscando nodo (1):");
        arbolB.imprimirNodoEspecifico(arbolB, 1);
        System.out.println();
        
        System.out.println("Buscando nodo (16):");
        arbolB.imprimirNodoEspecifico(arbolB, 16);
        System.out.println();
    }
}
