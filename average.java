// Write a Java method to compute the average of three numbers..

import java.util.*;
public class average {

    public static float Average(float num1,float num2,float num3){
        float Ave = (num1+num2+num3)/3;
        return Ave; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second number: ");
        float b = sc.nextFloat();
        System.out.print("Enter third number: ");
        float c = sc.nextFloat();
        System.out.print("Average of " + a + " and " + b + " and " + c + " is " + Average(a, b, c));
        sc.close();
    }
}
