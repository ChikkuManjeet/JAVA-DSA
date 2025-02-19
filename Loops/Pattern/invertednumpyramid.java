// print a pattern like this
// 1234
// 123
// 12
// 1

import java.util.*;
public class invertednumpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter line you want to print pattern");
        int n = sc.nextInt();
        for(int i=n; i>=0; i--){
            int a=1;
            for(int j=0; j<i; j++){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
        sc.close();
    }
}
