// calculate income;
import java.util.*;
public class incomecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your annual imcome");
        int income = sc.nextInt();
        int tax;
        if (income <= 500000){
            tax = income*0;
            System.out.println("you are tax free");
        }
        else if (income<=1000000){
            tax =  (int) ( income*0.2);
            System.out.println("your tax is " + tax);
        }
        else {
            tax = (int) (income*0.3);
            System.out.println("your tax is " + tax);
        }
    }
}
