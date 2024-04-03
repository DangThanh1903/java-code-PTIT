import java.util.Scanner;
import java.lang.Math;

public class J01005_ChiaTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            double n = sc.nextDouble();
            double h = sc.nextDouble();
            for (int i = 1; i < n; i++) {
                System.out.format("%.6f ", h*Math.sqrt(i)/Math.sqrt(n));
            }
            System.out.println();
            test--;
        }
        sc.close();
    }
}
