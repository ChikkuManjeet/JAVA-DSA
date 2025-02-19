// Write a code to print product of two nummber
import java.util.*;
public class product {
    public static float multiply(float a , float b){
         float product = a*b;
         return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        float num1 = sc.nextFloat();
        System.out.println("Enter second number:");
        float num2 = sc.nextFloat();
        float mul = multiply(num1, num2);
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + mul);
        sc.close();
    }
}
