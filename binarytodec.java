// Write a code to convert binary number to decimal number

import java.util.*;
public class binarytodec {
    public static void BinNum(int n){
      int power = 0;
      int decNum = 0;
        while (n>0) {
            int lastDigit = n%10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, power));

            power ++;

            n = n/10;
        }
        System.out.println("decimal number is " + decNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number");
        int b = sc.nextInt();
        BinNum(b);
        sc.close();
    }
}
