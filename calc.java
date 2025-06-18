import java.util.Scanner;
class calc {
    public static void main(String[] args)
    {   float x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one number: ");
        x=sc.nextFloat();
        System.out.println("Enter the operator (+,-,*,/,^): ");
        char op=sc.next().charAt(0);
        if (op!='+' || op!='-' || op!='*' || op!='/' || op!='^');
        { System.out.println("Please enter a valid operator"); }
        System.exit(0);
        System.out.println("Enter another number: ");
        y=sc.nextFloat();
        switch (op) {
            case '+' -> System.out.println(x + y);   //enhanced switch case
            case '-' -> System.out.println(x - y);
            case '*' -> System.out.println(x * y);
            case '/' -> System.out.println(x / y);
            case '^' -> System.out.println(Math.pow(x, y));
            default -> {
            }
        }
        sc.close(); }}

