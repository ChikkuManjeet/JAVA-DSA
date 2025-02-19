// print a pattern of reverse tingle
// ABCD
// EFG
// HI
// j


import java.util.*;
public class reversechartringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line would you like to print pattern");
        int n = sc.nextInt();
        char ch = 'A';
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
            sc.close();
        }
    }
}
