import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which fibonacci term do you want? ");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int c=2;
        while(c<=n) {
            int temp = b ;
            b=b+a;
            a=temp;
            c++; }
        System.out.println(b); }
}
