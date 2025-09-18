import java.util.Scanner;
public class SelectionSort {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n-1 ; i++) {
                int minIn=i;
                for (int j = i+1; j < n; j++) {
                    if(arr[j]<arr[minIn]) {
                        minIn = j;
                    }}
                int temp=arr[i];
                arr[i]=arr[minIn];
                arr[minIn]=temp; }
            System.out.println("Sorted array is");
            for (int num : arr) {
                System.out.println(num + " ");
            }}}
