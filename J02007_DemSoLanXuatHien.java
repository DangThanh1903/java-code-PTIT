import java.util.Scanner;
import java.util.Arrays;

public class J02007_DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int[] ar = new int[100005];
        int[] ar1 = new int[100005];
        int t = 1;
        while (t <= test) {
            int n = sc.nextInt();
            Arrays.fill(ar, 0);
            for (int i = 0; i < n; i++) {
                ar1[i] = sc.nextInt();
                ar[ar1[i]]++;
            }
            System.out.println("Test " + t + ":");
            for (int i = 0; i < n; i++) {
                if (ar[ar1[i]] > 0) {
                    System.out.printf("%d xuat hien %d lan\n", ar1[i], ar[ar1[i]]);
                    ar[ar1[i]] = 0;
                }
            }
            t++;
        }
        sc.close();
    }
}
