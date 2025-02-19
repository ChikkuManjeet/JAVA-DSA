import java.util.*;
public class invertedhalfnum {
    public static void GetPyramid(int n){
        for(int i=1; i<=n; i++){
            int a = 1;
            for(int j=n; j>=i; j--){
                System.out.print(a);
                a++;
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
