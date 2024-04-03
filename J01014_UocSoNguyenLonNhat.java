import java.util.Scanner;

public class J01014_UocSoNguyenLonNhat {   
    public static boolean isPrime(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            long res = 0, ok = 0;
            long n = sc.nextLong();
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (isPrime(n / i)) {
                        System.out.println(n / i);
                        ok = 1;
                        break;
                    }
                    if (isPrime(i)) {
                        res = i;
                    }
                }
            }
            if (ok == 0) System.out.println(res);
        }
        sc.close();
    }
}

// 315 = 3 3 5 7