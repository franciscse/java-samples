import java.util.Scanner;

public class PolinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        sc.close();
        int temp = num;
        int rev = 0;
        int rem = 0;
        while (num >0) {
            rem = num %10;
            num = num /10;
            rev = rev * 10 + rem;       
        }
        if (temp == rev) {
            System.out.println("The number is a polindrome number");
        } else {
            System.out.println("The number is not a polindrome number");
        }
    }
    
}
