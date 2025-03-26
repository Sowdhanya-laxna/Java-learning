package D5;
import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        try {
            // Writing data to the file
            FileWriter w = new FileWriter("./ex.txt");
            w.write("hello,java!!");
            w.write("\nHow is the coding?");
            w.close();
            System.out.println("Data is written");
            
            // Reading data from the file
            FileReader r = new FileReader("./ex.txt");
            int c;
            while ((c = r.read()) != -1) { 
                System.out.print((char) c); 
            }
            r.close();
        } catch (IOException e) {
            System.out.println("Couldn't access: " + e.getMessage());
        }
    }
}
