import java.util.Scanner;
// write a program to check the number is odd or even
public class OddOrEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to check odd or even : ");
        int n =in.nextInt();
        in.close();
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
