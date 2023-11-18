public class ArbolAVL {
    NodoAVL raiz;

    public ArbolAVL() {
    }
    
    //Factor de equilibrio
    private int getFactorEquilibrio(NodoAVL nodoActual) {
        if (nodoActual == null) {
            return 0;
        }
        return getAltura(nodoActual.izquierda) - getAltura(nodoActual.derecha);
    }
    
    //Encontrar el maximo, para actualizar la altura
    private int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    //Getter para altura
    private int getAltura(NodoAVL nodoActual) {

        if (nodoActual == null) {
            return 0;
        }
        return nodoActual.altura;
    }
    
    //Nodo con valor maximo
    private NodoAVL getNodoConValorMaximo(NodoAVL nodo) {
        NodoAVL actual = nodo;
        while (actual.derecha != null) {
            actual = actual.derecha;
        }
        return actual;
    }
    
    /* -----INSERTAR----- */
    public void insertar(int dato) {
        raiz = insertarAVL(raiz, dato);
    }

    private NodoAVL insertarAVL(NodoAVL nodoActual, int dato) {

        if (nodoActual == null) {
            return (new NodoAVL(dato));
        }
        if (dato < nodoActual.dato) {
            nodoActual.izquierda = insertarAVL(nodoActual.izquierda, dato);
        } else if (dato > nodoActual.dato) {
            nodoActual.derecha = insertarAVL(nodoActual.derecha, dato);
        } else {
            return nodoActual;
        }
        nodoActual.altura = 1 + max(getAltura(nodoActual.izquierda), getAltura(nodoActual.derecha));
        
        int factEq = getFactorEquilibrio(nodoActual);
        
        //Rotaciones
        
        //Rotacion simple a la derecha
        if (factEq > 1 && dato < nodoActual.izquierda.dato) {
            return rotacionDerecha(nodoActual);
        }
        //Rotacion simple a la izquierda
        if (factEq < -1 && dato > nodoActual.derecha.dato) {
            return rotacionIzquierda(nodoActual);
        }
        //Caso rotacion doble izquierda-derecha
        if (factEq > 1 && dato < nodoActual.izquierda.dato) {
            nodoActual.izquierda = rotacionDerecha(nodoActual.izquierda);
            return rotacionIzquierda(nodoActual);
        }
        //Caso rotacion doble derecha-izquierda
        if (factEq < -1 && dato < nodoActual.derecha.dato) {
            nodoActual.derecha = rotacionDerecha(nodoActual.derecha);
            return rotacionIzquierda(nodoActual);
        }
        return nodoActual;
    }
    
    /* -----ELIMINAR----- */
    public void eliminar(int dato) {
        raiz = eliminarAVL(raiz, dato);
    }

    private NodoAVL eliminarAVL(NodoAVL nodoActual, int dato) {
        if (nodoActual == null)
            return nodoActual;
            
        //Recursividad para encontrar el dato a eliminar
        if (dato < nodoActual.dato) {
            nodoActual.izquierda = eliminarAVL(nodoActual.izquierda, dato);
        } else if (dato > nodoActual.dato) {
            nodoActual.derecha = eliminarAVL(nodoActual.derecha, dato);
        } else {
            //Se encontro el dato
            
            //Nodo con hijo o sin hijos
            if ((nodoActual.izquierda == null) || (nodoActual.derecha == null)) {
                NodoAVL temp = null;
                if (temp == nodoActual.izquierda) {
                    temp = nodoActual.derecha;
                } else {
                    temp = nodoActual.izquierda;
                }
                /*El nodo tiene hijos o no?
                Cuando no tiene hijos */
                if (temp == null) {
                    nodoActual = null;
                //Cuando tiene hijos        
                } else {
                    nodoActual = temp;
                } 
                //Se elimina el valor actual reemplzandolo por su hijo
            } else {
                //Caso complejo: Nodo con dos hijos
                NodoAVL temp = getNodoConValorMaximo(nodoActual.izquierda);
                nodoActual.dato = temp.dato;
                nodoActual.izquierda = eliminarAVL(nodoActual.izquierda, temp.dato);
            }
        }
        
        if (nodoActual == null) {
            return nodoActual;
        }
        
        //Atualizar altura
        nodoActual.altura = max(getAltura(nodoActual.izquierda), getAltura(nodoActual.izquierda)) + 1;
        
        int factEq = getFactorEquilibrio(nodoActual);
        
        //Rotaciones
        
        //Rotacion simple a la derecha
        if (factEq > 1 && getFactorEquilibrio(nodoActual.izquierda) >= 0) {
            return rotacionDerecha(nodoActual);
        }
        //Rotacion simple a la izquierda
        if (factEq < -1 && getFactorEquilibrio(nodoActual.derecha) <= 0) {
            return rotacionIzquierda(nodoActual);
        }
        //Caso rotacion doble izquierda-derecha
        if (factEq > 1 && getFactorEquilibrio(nodoActual.izquierda) < 0) {
            nodoActual.izquierda = rotacionDerecha(nodoActual.izquierda);
            return rotacionIzquierda(nodoActual);
        }
        //Caso rotacion doble derecha-izquierda
        if (factEq < -1 && getFactorEquilibrio(nodoActual.derecha) > 0) {
            nodoActual.derecha = rotacionDerecha(nodoActual.derecha);
            return rotacionIzquierda(nodoActual);
        }
        return nodoActual;
    }

    /* -----BUSQUEDA----- */
    public void buscar(int elemento) {
        if (BuscarEnAVL(raiz, elemento)) {
            System.out.println("El dato " + elemento + " existe.");
        } else {
            System.out.println("El dato " + elemento + " no existe.");
        }
    }
    
    //Recorrer el arbol con recursividad
    public boolean BuscarEnAVL(NodoAVL nodoActual, int elemento) {
        if (nodoActual == null) {
            return false;
        } else if (elemento == nodoActual.dato) {
            return true;
        } else if (elemento < nodoActual.dato) {
            return BuscarEnAVL(nodoActual.izquierda, elemento);
        } else {
            return BuscarEnAVL(nodoActual.derecha, elemento);
        }
    }
    
    //Rotaciones
    private NodoAVL rotacionDerecha(NodoAVL nodoActual) {
        NodoAVL nuevaRaiz = nodoActual.izquierda;
        NodoAVL aux = nuevaRaiz.derecha;

        nuevaRaiz.derecha = nodoActual;
        nodoActual.izquierda = aux;

        nodoActual.altura = max(getAltura(nodoActual.izquierda), getAltura(nodoActual.derecha)) + 1;
        nuevaRaiz.altura = max(getAltura(nodoActual.izquierda), getAltura(nodoActual.derecha)) + 1;
        return nuevaRaiz;
    }

    private NodoAVL rotacionIzquierda(NodoAVL nodoActual) {
        NodoAVL nuevaRaiz = nodoActual.derecha;
        NodoAVL aux = nuevaRaiz.izquierda;

        nuevaRaiz.izquierda = nodoActual;
        nodoActual.derecha = aux;

        nodoActual.altura = max(getAltura(nodoActual.izquierda), getAltura(nodoActual.derecha)) + 1;
        nuevaRaiz.altura = max(getAltura(nodoActual.izquierda), getAltura(nodoActual.derecha)) + 1;
        return nuevaRaiz;
    }

    //Mostrar el arbol
    public void mostrarArbolAVL() {
        System.out.println("Arbol AVL");
        mostrarArbol(raiz, 0);
        System.out.println();
    }

    private void mostrarArbol(NodoAVL nodo, int nivel) {
        if (nodo.derecha != null) {
            mostrarArbol(nodo.derecha, nivel + 1);
        }
        for (int i = 0; i < nivel; i++) {
            System.out.print("    ");
        }
        System.out.println("(" + nodo.dato + ")");
        if (nodo.izquierda != null) {
            mostrarArbol(nodo.izquierda, nivel + 1);
        }
    }
}
