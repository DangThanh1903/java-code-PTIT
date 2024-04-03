import java.util.Scanner;

public class J02022_SoXaCach {
    public static Scanner sc = new Scanner(System.in);
    public static int n;
    public static int[] arr;
    public static int[] used;
    public static void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (used[j] == 0) {
                arr[i] = j;
                used[j] = 1;
                if (i == n) {
                    inkq();
                }
                else{
                    Try(i + 1);
                }
                used[j] = 0;
            }
        }
    }

    public static void inkq() {
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i + 1] == 1 || arr[i + 1] - arr[i] == 1) {
                return;
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int test = sc.nextInt();
        while (test-- > 0) {
            n = sc.nextInt();
            arr = new int[n + 1];
            used = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = i;
            }
            Try(1);
        }
        
        sc.close();
    }
}


// 1 2 3 4 | 1 2 4 3 | 1 3 2 4 | 1 3 4 2 | 1 4 2 3 | 1 4 3 2 | 2 1 3 4