// Write a code to print binomialcoefficient of given input
import java.util.*;
public class binomialcoefficient {
    public static int Factorial(int a){
        int fact =1;
        for(int i=1; i<=a; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static int Binomial(int n, int r){
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int factn_nr = Factorial(n-r);
        int Binomialcoefficient = fact_n / (fact_r * factn_nr);
        return Binomialcoefficient ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number r: ");
        int num2 = sc.nextInt();
        int Binomial = Binomial(num1,num2);
        System.out.println("Binomiol coefficient is " + Binomial);
        sc.close();
    }
}