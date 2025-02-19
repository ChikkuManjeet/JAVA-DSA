// Write a Java program that continuously takes integer inputs from the user until they type 'done'. 
// The program should then calculate and print the sum of even and odd integers separately.

import java.util.*;

public class sumEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Enter numbers separated by spaces (type 'done' to finish):");
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                if (n % 2 == 0) {
                    evenSum += n;
                } else {
                    oddSum += n;
                }
            } else {
                String input = sc.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter integers or 'done' to finish.");
                }
            }
        }
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        sc.close();
    }
}

