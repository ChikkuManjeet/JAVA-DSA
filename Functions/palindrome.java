// Write a Java program to check if a number is a palindrome in Java? ( 121 is
// a palindrome, 321 is not)
// A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is
// a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a
// palindrome because the reverse of 321 is 123, which is not equal to 321.


import java.util.*;
public class palindrome {
    public static void palindromeNum(int n){
        int num  = n;
        int reverse = 0;
        while (n>0) {
            int lastDigit = n%10;
            reverse = reverse * 10 + lastDigit;
            n = n/10;
        }
        if ( reverse== num) {
            System.out.println(num + " is a Palindrome number because it's reverse number is equal to it's original number " + num + " ==" + reverse);
        }
        else{
            System.out.println(num + " is not a Palindrome number because it's reverse number is not equal to it's orignial number " + num + " !=" + reverse);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to Check: ");
        int num = sc.nextInt();
        palindromeNum(num);
        sc.close();
    }
}
