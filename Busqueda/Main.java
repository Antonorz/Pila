import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main (String[] args) {
        Scanner escaner = new Scanner(System.in);
        
        int[] arr = BusquedaBinaria.arrayAleatorio();
        
        System.out.println("Arreglo generado.");
        System.out.println("Antes: " + Arrays.toString(arr));
        System.out.println();
        
        int[] arrMergeSort = MergeSort.mergeSort(arr);
        
        System.out.println("Ahora: " + Arrays.toString(arrMergeSort));
        System.out.println();
        
        System.out.print("Inserte el entero que desee buscar: ");
        
        int busqueda = escaner.nextInt();
        int posicion = BusquedaBinaria.buscador(arrMergeSort, busqueda);
        
        if(posicion == -1){
            System.out.println("El entero que desea buscar no se encuentra dentro del array.");
        }else{
            System.out.println("El entero que desea buscar se ubica en la posicion: " + posicion);    
        }
    }
}
