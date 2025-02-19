// Write a Java method to compute the sum of the digits in an integer.
// (Hint : Approach this question in the following way :
// a. Take a variable sum = 0
// b. Find the last digit of the number
// c. Add it to the sum
// d. Repeat a & b until the number becomes 0 )

import java.util.*;
public class sumofdigit {
    public static void SumOfDigit(int num){
        int sum =0;
        while (num>0) {
             int lastDigit = num%10;
             sum = sum + lastDigit;
             num = num /10;
        }
        System.out.println("sum of each digit is " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        SumOfDigit(n);
        sc.close();
    }
}
