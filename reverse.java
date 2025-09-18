import java.util.Arrays;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++)
        { arr[i]=sc.nextInt(); }
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<e){
            swap(arr, s, e);
            s++;
            e--; }
    }
    static void swap(int[] arr, int a, int b)
    {   int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp; }
}
