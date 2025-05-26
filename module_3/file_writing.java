import java.io.FileWriter;
import java.util.Scanner;

public class file_writing {
    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Text : ");
            String user = scan.nextLine();
            FileWriter fw = new FileWriter("output.txt");
            fw.write(user);
            fw.close();
            System.out.println("written Successfully");
        } catch (Exception e) {
            System.err.println("Error Occurred");

        }
    }
}