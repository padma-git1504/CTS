import java.util.Scanner;
class palindrome{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String word = scan.nextLine();
        String reverse ="";
        for(int i=word.length()-1;i>=0;i--){
            reverse = reverse+word.charAt(i);
        }
        if (reverse.equals(word)) {
            System.out.println("The Give String is Palindrome");
            
        } else {
            System.out.println("The Give String is not a Palindrome");
        }
        
    }
}