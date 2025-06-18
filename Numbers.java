import java.util.Scanner;
public class Numbers {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        prime();
        palindrome();
        armstrong();
        harshad();
        spy();
        perfect();
        neon();
        factorial(); }
    static void prime() {
        if (n <= 1) {
            System.out.println("The number is neither prime nor composite.");
            return; }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                System.out.println("The number is not prime.");
                return; }
            c += 1; }
        System.out.println("The number is prime.");
    }
    static void palindrome() {
        int x = n;
        int rev = 0, r;
        while (x > 0) {
            r = x % 10;
            rev = rev * 10 + r;  //new variable method
            x /= 10;
        }
        if (rev == n) {
            System.out.println("The number is palindrome.");
        } else {
            System.out.println("The number is not palindrome."); }
    }  //same when reversed
    static void armstrong() {
        int x = n;
        int y = n;
        int r;
        int c = 0;
        int sum = 0;
        while (x > 0) {
            r = x % 10;
            x /= 10;
            c++; }
        while (y > 0) {
            r = y % 10;
            sum += Math.pow(r, c);
            y /= 10; }
        if (sum == n) {
            System.out.println("The number is an armstrong number.");
        } else {
            System.out.println("The number is not an armstrong number."); }
    }  //sum of each digit raised to the power equal to the number of digits
    static void harshad() {
        int y = n;
        int r;
        int sum = 0;
        while (y > 0) {
            r = y % 10;
            sum += r;
            y /= 10; }
        if (n % sum == 0) {
            System.out.println("The number is a Harshad number.");
        } else {
            System.out.println("The number is not a Harshad number."); }
    }  //number divisible by the sum of its digits
    static void spy() {
        int y = n;
        int r;
        int p = 1;
        int sum = 0;
        while (y > 0) {
            r = y % 10;
            sum += r;
            p *= r;
            y /= 10; }
        if (p == sum) {
            System.out.println("The number is a spy number.");
        } else {
            System.out.println("The number is not a spy number."); }
    }   //the product and sum of the digits are equal
    static void perfect() {
        int sum = 0;
        int x = n;
        System.out.print("The divisors of this number are: ");
        for (int i = 1; i <= n; i++) {
            if (x % i == 0) {
                System.out.print(i + " ");
                sum += i; }}
        int y = sum - n;
        if (n == y) {
            System.out.println("\nThe number is a perfect number.");
        } else {
            System.out.println("\nThe number is not a perfect number."); }
    }  //number equal to the sum of its divisors
    static void neon() {
        int x=n*n;
        int r;
        int sum=0;
        while(x>0) {
            r=x%10;
            sum+=r;
            x/=10; }
        if(sum==n) {
            System.out.println("The number is a neon number."); }
        else {
            System.out.println("The number is not a neon number."); }}  //number whose square's digits add up to the number itself
    static void factorial() {
        double x=n;
        int p=1;
        while(x>0) {
            p*=x;
            x--; }
        System.out.println("Factorial of this number is "+p);
    }
}




