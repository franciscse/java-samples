import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = 0;

        // Handle the case where the input is 0 separately
        if (number == 0) {
            count = 1;
        } else {
            // Handle negative numbers by repeatedly multiplying by -1 until positive
            while (number < 0) {
                number = number * -1;
            }
            
            while (number > 0) {
                number = number / 10; // Integer division by 10 removes the last digit
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
    }
}
