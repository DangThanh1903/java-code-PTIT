import java.math.BigInteger;
import java.util.Scanner;

public class J03033_BoiSoChungNhoNhat {
    public static BigInteger divisible(BigInteger a, BigInteger b) {
        if (a.divide(b).multiply(b) != a) {
            return a.subtract(a.divide(b).multiply(b));
        }
        return BigInteger.valueOf(0);
    }
    private static BigInteger findGCD(BigInteger x, BigInteger y) {
        if(y.compareTo(BigInteger.valueOf(0)) == 0){
            return x;
        }
        return findGCD(y, divisible(x, y));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger temp = a.multiply(b);
            System.out.println(temp.divide(findGCD(a, b)));
        }
        sc.close();
    }
}

