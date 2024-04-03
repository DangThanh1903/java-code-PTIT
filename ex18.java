import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter square matrix size: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        System.out.println("Enter square matrix elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int[][] resMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1)
                resMatrix[i][j] = 1;
            }
        }
        for (int k = 0; k < n - 1; k++) {
            for (int i = 0; i < n - k - 1; i++) {
                for (int j = 0; j < n - k - 1; j++) {
                    if (resMatrix[i][j] > 0) {
                        if (resMatrix[i + 1][j] == resMatrix[i + 1][j]
                        && resMatrix[i + 1][j] == resMatrix[i + 1][j + 1]
                        && resMatrix[i][j] == resMatrix[i + 1][j])
                        resMatrix[i][j]++;
                    }
                }
            }
        }
        int max = 0, row = 0, column = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (resMatrix[i][j] > max) {
                    max = resMatrix[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println("Maximum square submatrix size: " + max);
        System.out.println("Maximum square submatrix starting position: ["+ row + ", " + column + "]");
        }
    }
}