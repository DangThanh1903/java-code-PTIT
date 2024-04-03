import java.util.Scanner;
import java.lang.Math;

public class J01026_SoChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            long n = sc.nextLong();
            if ((int)Math.sqrt(n) * (int)Math.sqrt(n) == n) System.out.println("YES");
            else System.out.println("NO");
            test--;
        }
        sc.close();
    }
}
