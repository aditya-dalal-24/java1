import java.util.Arrays;
import java.util.Scanner;
public class QuickSort {
    static void QS(int[] arr, int l, int h){
        if(l<h) {
            int pivotIn = partition(arr, l, h);
            QS(arr, l, pivotIn - 1);
            QS(arr, pivotIn + 1, h);
        }}
    static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l;
        for (int j = l; j < h; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[h];
        arr[h] = temp;
        return i;
    }
public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            QS(arr,0,n-1);
    System.out.print("Sorted array: ");
    System.out.print(Arrays.toString(arr));

}}
