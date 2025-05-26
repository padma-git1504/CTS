
import java.util.Scanner;

class even_or_odd_checker{
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        Scanner scan =new Scanner(System.in);
        int num = scan.nextInt();
        if(num%2==0){
            System.out.println("The given Number is Even ");
        }
        else{
            System.out.println("The given Number is Odd ");
        }
    }
}