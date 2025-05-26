
import java.util.Scanner;

class factorial{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = scan.nextInt();
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial*=i;
        }
        System.out.println("The Factorial of the given Number is "+factorial);

    }
}