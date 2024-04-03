import java.util.Scanner;

class phanSo {
    private long tu, mau;
    public phanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public String getPhanSo() {
        long a = tu;
        long b = mau;
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        tu /= a;
        mau /= a;
        return String.format(tu + "/" + mau);
    }
}

public class testt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        phanSo ps = new phanSo(a, b);
        System.out.print(ps.getPhanSo());
    }
}
