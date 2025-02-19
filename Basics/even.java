// Write a method named isEven that accepts an int argument. The method
// should return true if the argument is even, or false otherwise. Also write a program to test
// your method.

import java.util.*;
public class even {
    public static void isEven(int a){
        if (a%2==0) {
            System.out.print(a + " is  even number");
        }
        else{
            System.out.print( a + " is odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        isEven(n);
        sc.close();
    }
}
