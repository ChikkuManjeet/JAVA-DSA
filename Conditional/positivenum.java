// Question 1 : Write a Java program to get a number from the user and print whether it is
// positive or negative

import java.util.*;
public class positivenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if (n>0) {
            System.out.println(n + " is a positive number");
        }
        else if (n == 0) {
            System.out.println(n + " is equal to zero");
        }
        else{
            System.out.println(n + " is a negative number");
        }
    }
}
