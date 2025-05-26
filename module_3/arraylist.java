import java.util.ArrayList;
import java.util.Scanner;

class arraylist{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        System.out.print("Enter the Student count you want to add : ");
        int count = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.print("Enter the Student name :");
            String newstud = scan.nextLine();
            students.add(newstud);
        }
        
            System.out.println(students);
            
        }


    }