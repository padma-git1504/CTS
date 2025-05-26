
import java.io.NotActiveException;
import java.util.Scanner;

class custom_exception{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int age = scan.nextInt();
        try {
            if(age<18){
                throw new NotActiveException("Not Eligible to vote");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}