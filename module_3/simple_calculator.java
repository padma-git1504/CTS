import java.util.Scanner;
class simple_calculator{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Addition\n2.Subraction \n3.multiplication \n4.Division");
        System.out.print("Enter your choice : ");
        int ch = scan.nextInt();
        System.out.print("Enter the first Number : ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second Number : ");
        int num2 = scan.nextInt();
        switch(ch){
            case 1:
                System.out.println("The Sum of two Numbers is "+(num1+num2));
                break;
            case 2:
                if(num1>num2){
                    System.out.println("The Difference of two Numbers is "+(num1-num2));

                }
                else{
                    System.out.println("The Difference of two Numbers is "+(num2-num1));

                }
                break;
            case 3:
                System.out.println("The Product of two Numbers is "+(num1*num2));
                break;
            case 4:
                System.out.println("The Division of two Numbers is "+(num1/num2));
                break;
        }
        
    }
}