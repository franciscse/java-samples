import java.util.Scanner;
//write the code for find the largest number of two input
public class LargeNumber {
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the first number : ");
        int a = in.nextInt();
        System.out.print("Enter the Second number : ");
        int b = in.nextInt();
        in.close();
        if (a>b){
            System.out.println(a+" is largest number");
        }else{
            System.out.println(b+" is Largest number");
        }
    }
}
