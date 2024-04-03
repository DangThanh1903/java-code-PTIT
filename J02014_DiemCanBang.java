import java.util.Scanner;

public class J02014_DiemCanBang {
    public static void FindCenter(int[] ar, int n, long sum) {
        long tempSum = ar[0];
        for (int i = 1; i < n; i++) {  
            if ((sum - ar[i] - tempSum) == tempSum) {
                System.out.println(i + 1);
                return;
            }
            tempSum += ar[i];
        }
        System.out.println("-1");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            int[] ar = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
                sum += ar[i];
            }
            FindCenter(ar, n, sum);
        }
        sc.close();
    }

}
