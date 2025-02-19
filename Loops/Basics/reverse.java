// write a program to print teh revrse of given number

import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number that you want to reverse");
        int num = sc.nextInt();
        while (num>0) {
            int lastdigit = num%10;
            System.out.print(lastdigit);
            num = num/10;
        }
        sc.close();

    }
}
