import java.util.Scanner;
public class DigitAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int sum;
        int r;
        do { sum=0;
            while(num>0) {
                r=num%10;
                sum+=r;
                num/=10; }
            num=sum; }
        while(sum>=10);
        System.out.println(sum); }}