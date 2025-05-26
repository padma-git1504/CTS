import java.io.BufferedReader;
import java.io.FileReader;

public class file_read {
    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("output.txt");
            BufferedReader bf = new BufferedReader(fr);
            String line = bf.readLine();
            if(line==null){
                System.out.println("the file is empty");
            }
            else{
            while(line != null){
                System.out.println(line);
                line = bf.readLine();
            }
             System.out.println("read Successfully");
        }
            bf.close();
           
        } catch (Exception e) {
            System.err.println("Error Occurred");

        }
    }

    public file_read() {
    }
}