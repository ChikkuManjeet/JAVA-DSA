// write a code to check number is prime or not

import java.util.*;
public class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a prime number");
        } else if (num == 2) {
            System.out.println(num + " is a prime number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Exit the loop since we've found a factor
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is a composite number");
            }
        }
        sc.close();
    }
}
