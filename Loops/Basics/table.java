// Question 4 : Write a program to print the multiplication table of a number N, entered by the
// user

import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("enter a number: ");
        num = sc.nextInt();
        for(int i = num; i<=num*10; i=i+num){
            System.out.println(i);
        }
        sc.close();
    }
}
