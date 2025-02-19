// Write a code to print all prime number within a range given by user

import java.util.*;

public class rangeprimenum {

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
           for (int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
            return false;
        }
            }
            return true;
    }

    public static  void primeRange(int n){
        for(int i=2; i<n; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range you want to print prime number: ");
        int  num = sc.nextInt();
        primeRange(num);
        sc.close();
    }
}
