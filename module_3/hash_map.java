import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

class hash_map{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> user = new HashMap<>();
        System.out.println("How many entries do want to add?");
        int count = scan.nextInt();
        scan.nextLine();
        for (int i = 1; i <= count; i++) {
            System.out.println("\n Entry "+i+";");
            System.out.println("Enter name : ");
            String name = scan.nextLine();
            System.out.println("Enter age : ");
            int age = scan.nextInt();
            scan.nextLine();

            user.put(name, age);
        }
        System.out.println("\n--- User Data ---");
        for(Entry<String, Integer> entry : user.entrySet()){
            System.out.println(entry.getKey() +"-->" +entry.getValue());
        }
        scan.close();
    }
}