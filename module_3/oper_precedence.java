import java.util.Scanner;
class oper_precedence{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a = scan.nextInt();
        System.out.print("Enter the second number :");
        int b= scan.nextInt();
        System.out.print("Enter the third number :");
        int c= scan.nextInt();
        System.out.print("Enter the fourth number :");
        int d= scan.nextInt();
        int e = a+b*c/d;
        System.out.println(a+"+"+b+"*"+c+"/"+d+"="+e);
    }
}