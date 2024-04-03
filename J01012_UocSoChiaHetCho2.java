import java.util.Scanner;

public class J01012_UocSoChiaHetCho2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            int n = sc.nextInt();
            if (n % 2 == 1) System.out.println("0");
            else {
                int ans = 0;
                while (n % 2 == 0) {
                    ans++;
                    n /= 2;
                }
                int N = n;
                for (int i = 3; i <= Math.sqrt(n); i += 2) {
                    int cnt = 0;
                    while (N % i == 0) {
                        cnt++;
                        N /= i;
                    }
                    if (cnt != 0) {
                        ans *= cnt + 1;
                    }
                }
                if (N != 1) {
                    ans *= 2;
                }
                System.out.println(ans);
            }
            test--;
        }
        sc.close();
    }
}

/* 
96 = 10 
2(5) 3

168 = 12
2(3) 3(1) 7(1)

1848 = 24
2(3) 3(1) 7(1) 11(1)

5544 = 36
2(3) 3(2) 7(1) 11(1)

16632 = 48
2(3) 3(3) 7(1) 11(1)

38808 = 54
2(3) 3(2) 7(2) 11(1)
*/ 
