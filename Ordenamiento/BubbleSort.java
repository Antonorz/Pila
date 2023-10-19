import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr){
        return bubbleSort(arr, arr.length);
    }
    
    private static int[] bubbleSort(int[] arr, int length){
        for(int i = 0; i < length; i++){
            for(int j = i + 1; j < length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    System.out.println("-" + Arrays.toString(arr));
                }
            }
        }
        return arr;
    }
}