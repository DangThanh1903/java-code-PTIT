import java.util.Scanner;

public class J02101_InMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            int n = sc.nextInt();
            int[][] ar = new int[n][n];
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < n; j++) {
                        ar[i][j] = sc.nextInt();
                    }
                }
                else {
                    for (int j = n - 1; j >= 0; j--) {
                        ar[i][j] = sc.nextInt();
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(ar[i][j] + " ");
                }
            }
            System.out.println();
            test--;
        }
        sc.close();
    }
}
