import java.util.*;
public class reversetringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many line you want to print inverted star ");
        int n = sc.nextInt();
        for(int i=n; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }
    }
}
