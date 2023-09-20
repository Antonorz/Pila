public class Main {
	public static void main (String [] args) {
		System.out.println("Lista Doblemente Enlazada");
		ListaDoblementeEnlazada listaD = new ListaDoblementeEnlazada();

            		listaD.insertar(5);
            		listaD.insertar(59);
            		listaD.insertar(91);
            		listaD.insertar(-17);
            		listaD.insertar(73);
                listaD.insertar(34);
                listaD.insertar(40);
                listaD.eliminar(2);
                listaD.eliminar(3);
                System.out.printf("Indice 3: %d\n", listaD.obtener(3));
				
	}
}
