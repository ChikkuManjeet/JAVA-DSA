// Write a code to convert Decimal number to binary number

import java.util.*;
public class dectobinary {
    public static void DecToBin(int  n ){
        int mynum = n;
        int pow = 0;
        int BinNum = 0;
        while (n>0) {
            int rem = n%2;
            BinNum = BinNum+ rem *(int) Math.pow(10,pow);
            pow++;
            n = n/2;
        }
        System.out.println("Binay form of " + mynum + " is " + BinNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        DecToBin(num);
        sc.close();
    }
}
