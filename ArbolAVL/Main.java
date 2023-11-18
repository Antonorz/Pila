public class Main {
    public static void main(String[] args) {
        ArbolAVL arbolAVL = new ArbolAVL();
        
        arbolAVL.insertar(1);
        arbolAVL.insertar(2);
        arbolAVL.mostrarArbolAVL();

        arbolAVL.insertar(3);
        System.out.println("Se observa la rotacion al insertar el 3:");
        arbolAVL.mostrarArbolAVL();
        
        arbolAVL.insertar(4);
        arbolAVL.mostrarArbolAVL();
        
        arbolAVL.insertar(5);
        System.out.println("Se observa la rotacion al insertar el 5:");
        arbolAVL.mostrarArbolAVL();
        
        System.out.println("Se realizan busquedas:");
        arbolAVL.buscar(1);
        arbolAVL.buscar(6);
        
        System.out.println("Eliminamos elementos, realizamos unas busquedas y mostramos el arbol:");
        arbolAVL.eliminar(1);
        arbolAVL.eliminar(5);
        
        arbolAVL.buscar(1);
        arbolAVL.buscar(5);
        
        arbolAVL.mostrarArbolAVL();
        System.out.println("Se observa la rotacion al insertar el 5 y el 6\nObserve que pasa con el 1 al insertarlo");
        arbolAVL.insertar(5);
        arbolAVL.insertar(6);
        
        arbolAVL.insertar(1);
        
        arbolAVL.mostrarArbolAVL();     
    }
}
