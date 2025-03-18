package Homework;
import java.util.Scanner;

public class Fibbanocci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = s.nextInt();
        System.out.println("Fibonacci Series up to " + n + " terms:");
        System.out.println(n);
        
    }

    
    public static void printFibonacci(int n) {
        int first = 0, second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

