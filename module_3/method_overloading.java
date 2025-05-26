import java.util.Scanner;

class Calc{
    
    void add(int a,int b){
        System.out.println("The Sum is "+(a+b));
    }
    void add(int a, int b,int c){
    
        System.out.println("The Sum is "+(a+b+c));
    }
    void add(double d,double e){
      
        System.out.println("The Sum is "+(d+e));
    }
}
class method_overloading{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calc ob = new Calc();
        System.out.println("enter integer number1 : ");
        int a = scan.nextInt();
        System.out.println("enter integer number2 : ");
        int b = scan.nextInt();
        System.out.println("enter interger number3 : ");
        int c = scan.nextInt();
        System.out.println("enter double number1 : ");
        double d = scan.nextDouble();
        System.out.println("enter double number2 : ");
        double e = scan.nextDouble();
        ob.add(a,b);
        ob.add(a, b, c);
        ob.add(d,e);
        
        
    }
}