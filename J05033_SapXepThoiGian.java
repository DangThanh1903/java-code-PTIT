import java.util.Arrays;
import java.util.Scanner;


public class J05033_SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int[] ar = new int[test];
        for (int i = 0; i < test; i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            ar[i] = h * 3600 + m * 60 + s;
        }
        Arrays.sort(ar);
        for (int i = 0; i < test; i++) {
            System.out.printf("%d %d %d\n", ar[i]/3600, (ar[i]%3600)/60, ar[i]%60);
        }
        sc.close();
    }
}
