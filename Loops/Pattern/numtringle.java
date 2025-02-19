import java.util.*;
public class numtringle {
    public static void GetTringle(int r){
        for(int i=1; i<=r; i++){
            int A= 1;
            for(int j=1; j<=i; j++){
                System.out.print(A );
                A++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows: ");
        int n = sc.nextInt();
        GetTringle(n);
        sc.close();
    }
}
