import java.math.BigInteger;
import java.util.Scanner;

public class J03013_HieuSoNguyenLon1 {
    public static void minus(String x, String y) {
        String ans = "";
        int temp = 0;
        int z = 0, v = 0;
        for (z = y.length() - 1, v = x.length() - 1; z >= 0 && v >= 0; z--, v--) {
            if (y.charAt(z) - temp > x.charAt(v)) {
                ans += (char) (y.charAt(z) - x.charAt(v) + 48 - temp);
                temp = 0;
            } else {
                if (y.charAt(z) - temp == x.charAt(v)) {
                    ans += '0';
                    temp = 0;
                } else {
                    ans += (char) (y.charAt(z) - x.charAt(v) + 58 - temp);
                    temp = 1;
                }
            }
        }
        for (; z >= 0; z--) {
            if (y.charAt(z) - temp < '0') {
                ans += '9';
                temp = 1;
            } else {
                ans += (char) (y.charAt(z) - temp);
                temp = 0;
            }
        }
        for (int n = ans.length() - 1; n >= 0; n--) {
            System.out.print(ans.charAt(n));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = a.subtract(b).abs();

            StringBuilder sb = new StringBuilder(c.toString());
            int maxLen = Math.max(a.toString().length(), b.toString().length());
            while (sb.length() < maxLen) {
                sb.insert(0, '0');
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
