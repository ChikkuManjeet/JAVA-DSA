import java.util.*;
public class roatednumhalfpyramid {
    public static void GetPyramid(int r){
        for(int i=1; i<=r; i++){
            int a=1;
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows: ");
        int n = sc.nextInt();
        GetPyramid(n);
        sc.close();
    }
}
