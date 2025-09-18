import java.util.Arrays;
import java.util.Scanner;
public class LinSearch {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); }
        System.out.print("Minimum element is: ");
        System.out.print(min(arr));
        System.out.println();
        System.out.print("Maximum element is: ");
        System.out.println(max(arr));
        System.out.println("Even numbers are: ");
        even(arr);
        System.out.println("Odd numbers are: ");
        odd(arr);
    }
    static int min(int[] arr) {
        int ans = arr[0];  //enhanced for loop
        for (int j : arr) {
            if (j < ans) {
                ans = j; }}
        return ans;
    }
    static int max(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {  //normal for loop
            if (arr[i] > ans) {
                ans = arr[i]; }}
        return ans;
    }
    static void even(int[] arr) {
     int c=0;
        for (int k : arr) {
            if (k % 2 == 0) {
                c++; }}
        int e[] = new int[c];
        int in=0;
        for (int i : arr) {
            if (i % 2 == 0) {
                e[in++] = i; }}
            System.out.println(Arrays.toString(e));
    }
    static void odd(int[] arr) {
        int c=0;
        for (int k : arr) {
            if (k % 2 != 0) {
                c++; }}
        int o[] = new int[c];
        int in=0;
        for (int i : arr) {
            if (i % 2 != 0) {
                o[in++] = i; }}
        System.out.println(Arrays.toString(o)); }}



