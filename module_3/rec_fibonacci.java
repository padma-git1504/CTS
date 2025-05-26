
import java.util.Scanner;

class rec_fibonacci{
    

    static void fibo(int end){
        int start =1;
        int next = 1;
        int temp;
        end = end;
        System.out.println("The fibonacci series ");
        System.out.println(start);
        System.out.println(next);
        for(int i=0;i<end-1;i++){
            temp = start+next;
            System.out.println(temp);
            start=next;
            next=temp;
            
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the count : ");
        int end = scan.nextInt();
        fibo(end);

         
    }
}