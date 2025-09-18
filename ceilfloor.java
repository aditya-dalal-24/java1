import java.util.Arrays;
import java.util.Scanner;
public class ceilfloor {
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
        int ansC=ceil(arr, t);
        System.out.println("Ceil is at index: "+ansC);
        int ansF=floor(arr, t);
        System.out.println("Floor is at index: "+ansF);
    }
    static int ceil(int[] arr, int t){
        if(t>arr[arr.length-1]) {
            return -1; }
        int s=0, e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(t<arr[mid]){ e=mid-1; }
            else if(t>arr[mid]) { s=mid+1; }
            else { return mid;}}
    return s;    }

    static int floor(int[] arr, int t){
        int s=0, e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(t<arr[mid]){ e=mid-1; }
            else if(t>arr[mid]) { s=mid+1; }
            else { return mid;}}
        return e;    }
    }

