// Write a code to print summ of two number

import java.util.*;
public class sum {
    public static void calculatesum(int a, int b){
        int sum = a+b;
        System.out.println("Sum is " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        calculatesum(num1,num2);
        sc.close();
    }
}