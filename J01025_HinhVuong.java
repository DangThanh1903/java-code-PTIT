import java.util.Scanner;
import java.lang.Math;

public class J01025_HinhVuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        int x = 0, y = 0, x0 = 0, y0 = 0;
        x = Math.max(Math.max(x1, x2), Math.max(x3, x4));
        x0 = Math.min(Math.min(x1, x2), Math.min(x3, x4));
        y = Math.max(Math.max(y1, y2), Math.max(y3, y4));
        y0 = Math.min(Math.min(y1, y2), Math.min(y3, y4));
        System.out.println(Math.max(x - x0, y - y0) * Math.max(x - x0, y - y0));
        sc.close();
    }
}
