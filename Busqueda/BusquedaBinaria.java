public class BusquedaBinaria{
    public static int buscador(int[] arr, int busqueda){
        int inicio = 0; 
        int fin = arr.length - 1;
        while (inicio < fin) {
            int centro = ((inicio + fin) / 2 );
            if (arr[centro] == busqueda){
                return centro;
            }
                
            if (arr[centro] < busqueda){
                //System.out.println(centro); 
                inicio = centro;
            } else {
                //System.out.println(centro); 
                fin = centro;    
            }
        }
        return -1;
    }
}
