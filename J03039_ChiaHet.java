import java.math.BigInteger;
import java.util.Scanner;

public class J03039_ChiaHet {
    public static void dividable(BigInteger a, BigInteger b) {
        if (a.divide(b).multiply(b).compareTo(a) != 0) System.out.println("NO");
        else System.out.println("YES");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if (a.compareTo(b) == 1) dividable(a, b);
            else dividable(b, a);
        }
        sc.close();
    }
}
