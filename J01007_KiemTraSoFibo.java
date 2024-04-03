import java.util.Scanner;

public class J01007_KiemTraSoFibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            long ans = 0;
            long n = sc.nextLong();
            long a = 1;
            long b = 1;
            while (a < n || b < n) {
                if (a > b) b += a;
                else a += b;
                if (n == a || n == b) ans = 1;
            }
            if (ans == 1 || n == 1 || n == 0) System.out.println("YES");
            else System.out.println("NO");
            test--;
        }
        sc.close();
    }
}
