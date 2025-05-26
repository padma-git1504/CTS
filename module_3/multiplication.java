import java.util.Scanner;
class multiplication{
    public static void main(String args[]){
        System.out.print("Enter the Number for Multiplication Table : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
    
}