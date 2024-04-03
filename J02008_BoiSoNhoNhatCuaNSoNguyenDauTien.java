import java.util.Scanner;

public class J02008_BoiSoNhoNhatCuaNSoNguyenDauTien {
    public static long gcd(long a, long b) {
        while (b != 0) {
            long x = a % b;
            a = b;
            b = x;
        }
        return a;
    }
    public static long lcm(long a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            long ans = 1;
            int n = sc.nextInt();
            for (int i = 2; i <= n; i++) {
                ans = lcm(ans, i);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}

// 41 219060189739591200