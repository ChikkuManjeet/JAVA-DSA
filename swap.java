// Write a code to swap to number
import java.util.*;

public class swap {
    public static void swapNumber(int a ,int b){
        int temp = b;
        b = a;
        a= temp;
        System.out.print("After Swapping First Number is " + a + " and Second Number is " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        swapNumber(num1, num2);
        sc.close();
    }
}
