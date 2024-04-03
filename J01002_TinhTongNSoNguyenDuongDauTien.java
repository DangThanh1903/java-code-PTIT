import java.util.Scanner;

public class J01002_TinhTongNSoNguyenDuongDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            long n = sc.nextInt();
            long kq = n*(n+1)/2;
            System.out.println(kq);
            test--;
            sc.close();
        }
    }
}
