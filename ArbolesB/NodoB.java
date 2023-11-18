public class NodoB {
    int orden;
    int cantidad;
    int datos[];
    NodoB padre;
    NodoB hijos[];
    boolean hoja;

    public NodoB(int orden, NodoB padre) {
        this.orden = orden;
        this.padre = padre;
        datos = new int[2 * orden - 1];
        hijos = new NodoB[2 * orden];
        hoja = true;
        cantidad = 0;
    }

    public int getDato(int index) {
        return datos[index];
    }

    public NodoB getHijo(int index) {
        return hijos[index];
    }

    public void setDato(int index, int dato) {
        datos[index] = dato;
    }

    public void setHijo(int index, NodoB nodo) {
        hijos[index] = nodo;
    }

    public void setPadre(NodoB padre) {
        this.padre = padre;
    }

    public boolean esHoja() {
        return hoja;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getOrden() {
        return orden;
    }
    
    public NodoB getPadre() {
        return padre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setHoja(boolean hoja) {
        this.hoja = hoja;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }
}
