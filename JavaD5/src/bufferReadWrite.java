package D5;
import java.io.*;

public class bufferReadWrite {
    public static void main(String[] args) {
        try {
        	//buffer writer
        	 BufferedWriter writer = new BufferedWriter(new FileWriter("c:\\Test\\d.txt"));
             writer.write("This is a new line added to the file.");
             writer.newLine(); 
             writer.write("Buffer writer is done.");
             writer.close();
             System.out.println("Writing completed.");
        	//buffer-reader
            BufferedReader reader = new BufferedReader(new FileReader("c:\\Test\\d.txt"));
            String line;
            System.out.println("Reading file line by line:");
            while ((line = reader.readLine()) != null) { 
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Couldn't access: " + e.getMessage());
        }
    }
}
