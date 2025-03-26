package D5;
import java.io.File;
import java.io.IOException;

public class Filecreation {
    public static void main(String[] args) {
            File obj = new File("ex.txt");
            try {
            obj.createNewFile();
                System.out.println("File is created: ");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
