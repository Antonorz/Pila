public class ListaSimplementeEnlazada {
	private Nodo frente;
	private int longitud;
        private Nodo primerNodo;
	public ListaSimplementeEnlazada() {
		frente = null;
		longitud = 0;
	}
	public void insertar(int dato) {
		Nodo nuevoNodo = new Nodo(dato);
		if (frente == null) {
			frente = nuevoNodo;
		} else {
			Nodo nodoActual = frente;
			while (nodoActual.getSiguiente() != null) {
				nodoActual = nodoActual.getSiguiente();
			}
		nodoActual.setSiguiente(nuevoNodo);
	}
	longitud++;
	}
	public void eliminar() {
		if (frente != null) {
			frente = frente.getSiguiente();
			longitud--;
		}
	}
	public boolean estaVacia() {
		return frente == null;
	}
	public Nodo getFrente() {
		return frente;
	}
	public int getLongitud() {
		return longitud;
	}

    public int obtener(int indice) {
        if (indice < 0 || indice >= longitud) {
          System.err.println("Indice fuera de rango");
          return -1;
        }
        Nodo actualNodo = primerNodo;
        for (int i = 0; i < indice; i++) {
          actualNodo = actualNodo.getSiguiente();
        }
        return actualNodo.getDato();
    }
    
    public void eliminar(int indice) {
        if (indice < 0 || indice >= longitud) {
            System.err.println("Indice fuera de rango");
            return;
        }
        if (indice == 0) {
            // Si el índice es 0, el nodo a eliminar es el primer nodo.
            primerNodo = primerNodo.getSiguiente();
        } else {
            // Si el índice no es 0, encontramos el nodo anterior al nodo a eliminar.
            Nodo nodoAnterior = primerNodo;
            for (int i = 0; i < indice - 1; i++) {
            nodoAnterior = nodoAnterior.getSiguiente();
        }
            // Ahora, el nodo anterior apuntará al siguiente nodo del nodo a eliminar.
            Nodo nodoEliminar = nodoAnterior.getSiguiente();
            nodoAnterior.setSiguiente(nodoEliminar.getSiguiente());
        }
        longitud--;
    }
}
