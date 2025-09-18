import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class BinSearch {
    static void asc(int[] arr, int t){
        Arrays.sort(arr);
        System.out.println("Sorted array (ascending): " + Arrays.toString(arr));
        int s=0, e=arr.length-1;
        boolean f = false;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]>t) { e=m-1; }
            else if(arr[m]<t) { s=m+1; }
            else {
                System.out.println("Number found at index: "+m);
                f=true;
                break; }}
        if(f==false) {
            System.out.println("Number not found."); }}
    static void des(Integer[] arr1, int t){
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println("Sorted array (descending): " + Arrays.toString(arr1));
        int s=0, e=arr1.length-1;
        boolean f = false;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr1[m]<t) { e=m-1; }
            else if(arr1[m]>t) { s=m+1; }
            else {
                System.out.println("Number found at index: "+m);
                f=true;
                break; }}
        if(!f) {
            System.out.println("Number not found."); }}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        Integer[] arr1 = new Integer[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            arr1[i]=arr[i];
        }
        System.out.println("Enter the number to be found: ");
        int t=sc.nextInt();
        System.out.println("Press 1 for ascending order search:");
        System.out.println("Press 2 for descending order search:");
        int c = sc.nextInt();
        if(c==1){
            asc(arr,t); }
        else if(c==2){
            des(arr1, t); }
        else {
            System.out.println("Enter a valid choice."); }
        }}