import java.util.Scanner;
//write a program to find the sum and average of the numbers
public class SumAvg {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the total count of the number :");
        int t = n.nextInt();
        int sum =0, avg;
        for (int i = 1; i <= t; i++) {
            System.out.println("Enter the "+i+" Number :");
            int a = n.nextInt();
            sum = sum + a;
        }
        n.close();
        avg = sum/t;
        System.out.println("The sum of the numbers is :"+sum);
        System.out.println("The average of the numbers is :"+avg);
            
    }
}
