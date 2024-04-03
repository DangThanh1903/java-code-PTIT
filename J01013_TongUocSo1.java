import java.util.Scanner;

public class J01013_TongUocSo1 {
    public static final int N = (int) 2e6;
    public static int[] prime = new int[N + 5];

    public static void findMinDivisor() {
        for (int i = 2; i * i <= N; i++) {
            if (prime[i] == 0) {
                for (int j = i; j <= N; j += i) {
                    if (prime[j] == 0) {
                        prime[j] = i;
                    }
                }
            }
        }
        for (int i = 2; i <= N; i++) {
            if (prime[i] == 0) {
                prime[i] = i;
            }
        }
    }
    public static long caculate(int n) {
        long ans = 0;
        while (n != 1) {
            ans += prime[n];
            n /= prime[n];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        findMinDivisor();
        int test = sc.nextInt();
        long ans = 0;
        while (test-- > 0) {
            int num = sc.nextInt();
            if (num == 1) ans += 1;
            else ans += caculate(num);
        }
        System.out.print(ans);
        sc.close();
    }
}

// 199998 = 2 3 3 41 271