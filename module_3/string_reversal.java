import java.util.Scanner;
class string_reversal{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String word = scan.nextLine();
        String reverse ="";
        for(int i=word.length()-1;i>=0;i--){
            reverse = reverse+word.charAt(i);
        }
        System.out.println("The reverse of the given string is "+reverse);
    }
}