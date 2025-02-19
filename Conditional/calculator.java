//Make a calculator
import java.util.*;;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter operation would you like to perform(+,-,*,/,%)");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case '+' :{
                System.out.println("sum is " + (a+b));
                break;
            }
            case '-' :{
                System.out.println("subtract is " + (a-b));
                break;
            }
            case '*' :{
                System.out.println("multiplication is " + (a*b));
                break;
            }
            case '/' :{
                System.out.println("division is " + (a/b));
                break;
            }
            case '%' :{
                System.out.println("remainder is " + (a%b));
                break;
            }
            default: {
                System.out.println("you entered an invalid character");
            }
        }
    }
}
