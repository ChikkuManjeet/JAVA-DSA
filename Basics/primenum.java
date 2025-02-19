// writw a code to theck a number is prime or not:

import java.util.*;
public class primenum {
    public static boolean CheckPrimeNum(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false; // n is divisible by i, so it is not a prime number
            }
        }
        return true; // n is a prime number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  positive number:");
        int num = sc.nextInt();
        
        if (CheckPrimeNum(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        sc.close();
    }
}
