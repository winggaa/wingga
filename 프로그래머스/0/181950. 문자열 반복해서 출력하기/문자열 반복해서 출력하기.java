import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String rs = "";
        for(int i=1; i <= n; i++){
            rs += str;
        }
        System.out.print(rs);
    }
}