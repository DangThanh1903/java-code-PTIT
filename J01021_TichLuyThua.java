import java.util.Scanner;


public class J01021_TichLuyThua {
    public static int N = (int) 1e9 + 7;
    public static long pow(long a, long b) {
        if (b == 1) {
            return a % N;
        }
        if (b == 0) return 1;
        long temp = pow(a, b / 2);
        if (b % 2 == 0) return (temp * temp) % N;
        return ((temp * temp) % N) * a % N;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n < 20) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) break;
            System.out.println(pow(a, b));
            n++;
        }
        sc.close();
    }
}
