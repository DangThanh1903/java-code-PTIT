import java.util.Scanner;

public class J01001_HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long kq = (n*2 + m*2);
        long kq1 = (m * n);
        if (m <= 0 || n <= 0) System.out.println("0");
        else System.out.print(kq + " " + kq1);
        sc.close();
    }
}
