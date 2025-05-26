import java.util.Scanner;

class grade_calculator {
    public static void main(String[] args) {
        System.out.print("Enter the Number of Subject : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] marks = new int[num + 1];
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println("Enter the mark of subject " + i);
            marks[i] = scan.nextInt();
        }
        for (int x : marks) {
            sum = sum + x;
        }
        int avg = sum / num;
        if (avg >= 90) {
            System.out.print("Grade : A");
        } else if (avg >= 80) {
            System.out.print("Grade : B");
        } else if (avg >= 70) {
            System.out.print("Grade : C");
        } else if (avg >= 60) {
            System.out.print("Grade : D");
        } else {
            System.out.println("FAIL");
        }
    }
}