import java.util.Arrays;
import java.util.Scanner;
public class infinitearr {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of the array: ");
            int n = sc.nextInt();
            int[] arr=new int[n];
            System.out.println("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt(); }
            Arrays.sort(arr);
            System.out.println("Enter the target: ");
            int t = sc.nextInt();
        System.out.println("Target found at index: "+ans(arr,t)); }

    static int ans(int[] arr, int t){
        int s=0, e=1;
        while(t>arr[e]){
            int temp=e+1;
            e+=(e-s+1)*2;
            s=temp; }
        return infibin(arr,t,s,e); }

    static int infibin(int[] arr, int t, int s, int e){
        while(s<=e){
            int mid=s+(e-s)/2;
            if (t < arr[mid]) {
                e = mid - 1;
            } else if (t > arr[mid]) {
                s = mid + 1;
            } else {
                return mid; }}
        return -1; }}
