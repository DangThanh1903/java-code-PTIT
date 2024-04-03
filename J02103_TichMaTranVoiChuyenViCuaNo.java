import java.util.Scanner;

public class J02103_TichMaTranVoiChuyenViCuaNo {
    public static void multiply(int[][] matrix, int n, int m) {
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = 0;
                for (int z = 0; z < m; z++) {
                    ans[i][j] += matrix[i][z] * matrix[j][z];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
    // 1 2  | 1 4 7 
    // 4 5  | 2 5 8
    // 7 8  | 
    // 1 2 | 1 3
    // 3 4 | 2 4

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n][m];
            for (int x = 0; x < n; x++) {
                for (int z = 0; z < m; z++) {
                    matrix[x][z] = sc.nextInt();
                }
            }
            System.out.printf("Test %d: \n", i + 1);
            multiply(matrix, n, m);
        }
        sc.close();
    }

}
