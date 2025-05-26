
import java.util.Scanner;

class leap_year {
    public static void main(String[] args) {
        System.out.print("Enter the Year : ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap year");
            }

            else {
                System.out.println(year + " is not a leap year");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println(year + " is a Leap year");
            }

            else {
                System.out.println(year + " is not a leap year");
            }

        }
    }
}