package Homework;
import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();//RIGHT ALIGNMENT
            
        }

        Scanner N = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = N.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" "); // Print spaces
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*"); // Print stars
            }
            System.out.println();
        }
    }
}
