import java.util.Scanner;

public class J01009_TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0, temp = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                temp *= j;
            }
            ans += temp;
            temp = 1;
        }
        System.out.print(ans);
        sc.close();
    }
}
