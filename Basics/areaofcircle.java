import java.util.*;
public class areaofcircle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the radious of circle");
    float r = sc.nextFloat();
    float area = 3.14f*r*r;
    System.out.println("The area of circle is " + area);
  }  
}
