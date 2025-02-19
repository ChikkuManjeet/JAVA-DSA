// print a pattern 
// A
// BC
// DEF
// GHIJ

import java.util.*;
public class chartringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line would you like to print pattern");
        int n = sc.nextInt();
        char ch = 'A';
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            sc.close();
        }
    }
}
