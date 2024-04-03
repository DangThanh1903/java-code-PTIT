import java.util.Scanner;

public class J01006_TinhSoFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        long ans;
        while(test > 0) {
            int n = sc.nextInt();
            long a = 1;
            long b = 1;
            for (int i = 2; i != n; i++) {
                if (a > b) b += a;
                else a += b;
            }
            if (a > b) ans = a;
            else ans = b;
            if (n == 1 || n == 2) ans = 1;
            System.out.println(ans);
            test--;
        }
        sc.close();
    }
}
