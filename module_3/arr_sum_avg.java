import java.util.Scanner;

class arr_sum_avg{
    public static void main(String[] args) {
        System.out.print("Enter the Count of Number : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] num = new int[a + 1];
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            System.out.println("Enter the Number " + i);
            num[i] = scan.nextInt();
        }
        for (int x : num) {
            sum = sum + x;
        }
        int avg = sum / a;
        System.out.println("The Sum is "+sum);
        System.out.println("The average is "+avg);
    }
}