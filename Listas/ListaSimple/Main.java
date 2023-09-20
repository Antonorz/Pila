public class Main {
	public static void main (String [] args) {
            		System.out.println("Lista Simplemente Enlazada");
            		ListaSimplementeEnlazada listaS = new ListaSimplementeEnlazada();
            
            		listaS.insertar(5);
            		listaS.insertar(59);
            		listaS.insertar(91);
            		listaS.insertar(-17);
            		listaS.insertar(73);
                listaS.insertar(34);
                listaS.insertar(40);
                listaS.eliminar(2);
                listaS.eliminar(3);
                System.out.printf("Indice 3: %d\n", listaS.obtener(3));
				
	}
}
