package Homework;

import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = a.nextInt();

        
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // Loop from 2 to sqrt(num)
            if (num % i == 0) {
                return false; // If divisible by any number, not prime
            }
        }
        return true;
    }
}

