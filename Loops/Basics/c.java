// The Java program prompts the user to enter a number n and then calculates the sum of all integers from 1 to n

import java.util.*;
public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i<=n) {
            sum = sum+i;
            i++;
        }
        System.out.println("sum is " + sum);
        sc.close();
    }
}
