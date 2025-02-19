// pirnt larger number
import java.util.*;
 public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
         int a = sc.nextInt();
         System.out.println("enter second number");
         int b = sc.nextInt();
         if (a>b) {

            System.out.println("first number is greate " + a);
         }
         else if (a==b) {
            System.out.println("Both number is equal" + a);
         }
         else{
            System.out.println("second number is greater " + b);
         }
    }
    
}
