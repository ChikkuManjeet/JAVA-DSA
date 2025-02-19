// Question 2: In a program, input the side of a square. You have to output the area of the
// square.
// (Hint : area of a square is (side x side))
import java.util.*;
public class areaofsqare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the side of circle");
        float side = sc.nextFloat();
        double areaofsqare = side*side;
        System.out.println("the area of sqare is " + areaofsqare);
    }
}
