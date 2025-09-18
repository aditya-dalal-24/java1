import java.util.Scanner;
public class duplicate {
    public static void main(String[] args) {
        int dup=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int l=sc.nextInt();
        int[] arr=new int[l];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<=l-1; i++) {
            arr[i]=sc.nextInt(); }
        for(int i=0; i<=l; i++) {
            for (int j=i+1; j<l; j++) {
                if(arr[i]==arr[j]){
                    dup=arr[i]; }}}
        System.out.println(dup); }}
