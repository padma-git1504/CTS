
import java.util.Scanner;

class try_catch{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = scan.nextInt();
        try {
            System.out.println("The Division of the two number is "+num1/num2);
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}