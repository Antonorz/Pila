import java.util.Random;

public class BusquedaBinaria {
    public static int buscador(int[] arr, int busqueda) {
        int inicio = 0;
        int fin = arr.length - 1;
        
        while (inicio <= fin) {
            int centro = (inicio + fin + 1) / 2;
            
            if (arr[centro] == busqueda) {
                return centro;
            } else if (arr[centro] < busqueda) {
                inicio = centro + 1;
            } else {
                fin = centro - 1;
            }
        }
        return -1;
    }
    
    public static int[] arrayAleatorio() {
        Random aleatorio = new Random();
        int[] arr = new int[1000];
        int index = 0;
    
        while (index < 1000) {
            int nuevoNumero = aleatorio.nextInt(6562) + 1; //Matricula
            boolean repetido = false;
    
            for (int i = 0; i < index; i++) {
                if (arr[i] == nuevoNumero) {
                    repetido = true;
                    break;
                }
            }
    
            if (!repetido) {
                arr[index] = nuevoNumero;
                index++;
            }
        }
        return arr;
    }
}
