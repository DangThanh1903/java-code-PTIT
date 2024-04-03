import java.util.Scanner;

public class J02105_DanhSachKe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] matrix = new boolean[n][n];
        int x = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                x = sc.nextInt();
                if (x == 1) {
                    matrix[i][j] = true;
                }
                else matrix[i][j] = false;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("List(%d) = ", i + 1);
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]) System.out.printf("%d ", j + 1);
            }
            System.out.println();
        }
        sc.close();
    }
}
