public class ArbolB {
    
    int orden;
    NodoB raiz;

    public ArbolB(int orden) {
        this.orden = orden;
        raiz = new NodoB(orden, null);
    }

    public NodoB buscar(NodoB raiz, int dato) {
        int i = 0;

        while (i < raiz.getCantidad() && dato > raiz.getDato(i)) {
            i++;
        }
        if (i <= raiz.getCantidad() && dato == raiz.getDato(i)) {
            return raiz;
        }
        if (raiz.esHoja()) {
            return null;
        } else {
            return buscar(raiz.getHijo(i), dato);
        }
    }

    public void dividir(NodoB x, int i, NodoB y) {
        NodoB z = new NodoB(orden, null);

        z.setHoja(y.esHoja());
        z.setCantidad(orden - 1);

        for (int j = 0; j < orden - 1; j++) {
            z.setDato(j, y.getDato(j + orden));
        }
        if (!y.esHoja()) {
            for (int k = 0; k < orden; k++) {
                z.setHijo(k, y.getHijo(k + orden));
            }
        }

        y.setCantidad(orden - 1);

        for (int j = x.getCantidad(); j > i; j--) {
            x.setHijo(j + 1, x.getHijo(j));
        }
        x.setHijo(i + 1, z);

        for (int j = x.getCantidad(); j > i; j--) {
            x.setDato(j + 1, x.getDato(j));
        }
        x.setDato(i, y.getDato(orden - 1));

        y.setDato(orden - 1, 0);

        for (int j = 0; j < orden - 1; j++) {
            y.setDato(j + orden, 0);
        }
        x.setCantidad(x.getCantidad() + 1);
    }

    public void insercionNoLlena(NodoB x, int dato) {
        int i = x.getCantidad();

        if (x.esHoja()) {
            while (i >= 1 && dato < x.getDato(i - 1)) {
                x.setDato(i, x.getDato(i - 1));
                i--;
            }

            x.setDato(i, dato);
            x.setCantidad(x.getCantidad() + 1);
        } else {
            int j = 0;
            while (j < x.getCantidad() && dato > x.getDato(j)) {
                j++;
            }

            if (x.getHijo(j).getCantidad() == orden * 2 - 1) {
                dividir(x, j, x.getHijo(j));

                if (dato > x.getDato(j)) {
                    j++;
                }
            }

            insercionNoLlena(x.getHijo(j), dato);
        }
    }

    public void insertar(ArbolB t, int dato) {
        NodoB r = t.raiz;
        if (r.getCantidad() == 2 * orden - 1) {
            NodoB s = new NodoB(orden, null);
            t.raiz = s;
            s.setHoja(false);
            s.setCantidad(0);
            s.setHijo(0, r);
            dividir(s, 0, r);
            insercionNoLlena(s, dato);
        } else {
            insercionNoLlena(r, dato);
        }
    }

    public void imprimir(NodoB n) {
        for (int i = 0; i < n.getCantidad(); i++) {
            System.out.print(n.getDato(i) + " ");
        }

        if (!n.esHoja()) {
            for (int j = 0; j <= n.getCantidad(); j++) {
                if (n.getHijo(j) != null) {
                    System.out.println();
                    imprimir(n.getHijo(j));
                }
            }
        }
    }

    public void imprimirNodoEspecifico(ArbolB T, int x) {
        NodoB temp = new NodoB(orden, null);

        temp = buscar(T.raiz, x);

        if (temp == null) {
            System.out.println("Resultado de busqueda: No se encontro");
        } else {
            System.out.println("Resultado de busqueda: Nodo encontrado");
            imprimir(temp);
        }
    }

    public void eliminarDato(ArbolB t, int dato) {
        NodoB temp = new NodoB(orden, null);

        temp = buscar(t.raiz, dato);

        if (temp.esHoja() && temp.getCantidad() > orden - 1) {
            int i = 0;

            while (dato > temp.getDato(i)) {
                i++;
            }
            for (int j = i; j < 2 * orden - 2; j++) {
                temp.setDato(j, temp.getDato(j + 1));
            }
            temp.setCantidad(temp.getCantidad() - 1);
        } else {
            System.out.println("error");
        }
    }
}
