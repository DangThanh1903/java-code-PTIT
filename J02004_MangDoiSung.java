import java.util.Scanner;

public class J02004_MangDoiSung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int[] ar = new int[1000];
        while (test > 0) {
            int ok = 0;
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }
            for (int i = 0; i < n/2; i++) {
                if (ar[i] != ar[n - i - 1]) {
                    ok = 1;
                    System.out.println("NO");
                    break;
                }
            }
            if (ok == 0) System.out.println("YES");
            test--;
        }
        sc.close();
    }
}
