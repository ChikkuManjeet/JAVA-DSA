
// Question 3: Enter cost of 3 items from the user (using oat data type) - a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.*;
public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your pencil price");
        float pencil = sc.nextFloat();
        System.out.println("what is your pen price");
        float pen = sc.nextFloat();
        System.out.println("what is your eraser");
        float eraser = sc.nextFloat();
        float total = (pencil+pen+eraser);
        float gst = total*0.18f;
        float finalprice = total+gst;
        System.out.println("Your toal bill including gst is:" + finalprice);
    }
}
