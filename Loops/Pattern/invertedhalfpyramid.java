import java.util.*;
public class invertedhalfpyramid {
    public static void GetPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number of rows: ");
       int n = sc.nextInt(); 
       GetPyramid(n);
       sc.close();
    }
}
