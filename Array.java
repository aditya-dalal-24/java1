import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        a1(); }
    static void a1() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int l=sc.nextInt();
        int[] arr=new int[l];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<=l-1; i++) {
            arr[i]=sc.nextInt(); }
        for(int num : arr) {    //enhanced for loop
            System.out.print(num); }}}

