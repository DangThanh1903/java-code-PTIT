import java.util.Scanner;

public class J01003_GiaiPhuongTrinhBacNhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double m = sc.nextInt();
        double kq = -m/n;
        if (n == 0) {
            if (m == 0) System.out.println("VSN");
            else System.out.println("VN");
        }
        else System.out.format("%.2f", kq);
        sc.close();
    }
}
