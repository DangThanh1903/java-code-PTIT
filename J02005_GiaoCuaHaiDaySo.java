import java.util.Arrays;
import java.util.Scanner;

public class J02005_GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ar = new int[n];
        int[] ar1 = new int[m];
        int[] ans = new int[1005];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            ans[ar[i]] = 1;
        }
        for (int i = 0; i < m; i++) {
            ar1[i] = sc.nextInt();
        }
        Arrays.sort(ar1);
        for (int i = 0; i < m; i++) {
            if (ans[ar1[i]] == 1) {
                System.out.printf("%d ", ar1[i]);
                ans[ar1[i]] = 2;
            }
        }
        sc.close();
    }
}
