// write a code to print this pattern
// 1
// 12
// 123
// 1234

import java.util.*;
public class halfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many line you want to print pattern");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int a = 1;
            for(int j=1; j<=i; j++){
                System.out.print(a);
                a++; 
            }
            System.out.println();
        }
        sc.close();
    }
}
