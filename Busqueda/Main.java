import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main (String[] args) {
        Scanner escaner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.print("Inserte el entero que desee buscar: ");
        int busqueda = escaner.nextInt();
        int posicion = BusquedaBinaria.buscador(arr, busqueda);
        if(posicion == -1){
            System.out.print("El entero que desea buscar no se encuentra dentro del array.");
        }else{
            System.out.println("El entero que desea buscar se ubica en: " + posicion);    
        }
    }
}
