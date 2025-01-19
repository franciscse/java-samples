import java.util.Scanner;
// write a program to find the factorial of the number
public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to find the factorial :");
        int n = in.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        in.close();

        System.out.println("The factorial of the number is :"+fact);
    }
}
