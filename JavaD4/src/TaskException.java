package d4;
import java.util.*;

class Hello {
    String name;

    void talk() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name:");
        name = s.nextLine(); 
        s.close(); 
    }

    void talk(int a) {
        System.out.println("Hello " + name);
    }
}

public class TaskException {
    public static void main(String[] args) {
        Hello h = new Hello();
        h.talk();  
        
       
        h.talk(5);  
    }
}
