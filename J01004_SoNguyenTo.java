import java.util.Scanner;
import java.lang.Math;

public class J01004_SoNguyenTo {   
    public static void snt(long x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            long x = sc.nextLong();
            snt(x);
            test--;
        }
        sc.close();
    }
}
