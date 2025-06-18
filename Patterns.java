import java.util.Scanner;
public class Patterns {
    static int n;
    static void p1() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); }
            System.out.println(); }}
    static void p2() {
        for(int i=1; i<=n; i++)
        { for(int j=1; j<=i; j++)
        { System.out.print(j+" "); }
            System.out.println(); }}
    static void p3() {   //floyd's triangle
        int num=1;
        for(int i=1; i<=n; i++)
        { for(int j=1; j<=i; j++)
        { System.out.print(num + " ");
            num++; }
            System.out.println(); }
    }
    static void p4() {
        for(int i=1; i<=n; i++)
        {  char ch=(char)('A'+i);
            for (int j=0; j<=i; j++)
            { System.out.print(ch); }
            System.out.println(); }
        }
    static void p5() {
        for (int i = 0; i < n; i++) {
            int num = 1;
            System.out.print(" ".repeat((n - i) * 2));
            for (int j = 0; j <= i; j++) {
                System.out.print(num + "   ");
                num = num * (i - j) / (j + 1); } //pascal's triangle
            System.out.println();}
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        p1();
        System.out.println();
        p2();
        System.out.println();
        p3();
        System.out.println();
        p4();
        System.out.println();
        p5(); }
}
