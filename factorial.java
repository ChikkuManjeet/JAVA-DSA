// Write a code to print factorial of given number

import java.util.*;
public class factorial {
    public static int Factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        int fact = Factorial(num);
        System.out.println("Factorial of " + num +  " is " + fact);
        sc.close();
    }
}
