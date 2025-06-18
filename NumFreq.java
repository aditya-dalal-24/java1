import java.util.Scanner;
public class NumFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        String n = sc.next();
        System.out.println("Enter the digit whose frequency in this number is to be calculated: ");
        int a = sc.nextInt();
        char[] ch = n.toCharArray();
        char d = (char)(a+'0');  //new function learnt
        int count=0;
        for(int i=0; i<ch.length; i++) {
            if (ch[i]==d) {
                count++; }}
        System.out.println("The digit "+a+" in "+n+" is occuring "+count+" times."); }}

