import java.util.Scanner;


public class J03011_UocChungLonNhatCuaSoNguyenLon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            long a = sc.nextLong();
            String b = sc.next();
            long x = 0;
            for (int j = 0; j < b.length();) {
                if (x % a == x) {
                    x = x*10 + (int)b.charAt(j) - 48;
                    j++;
                }
                else {
                    x = x % a;
                }
            }
            while (x != a) {
                if (x > a) x -= a;
                else a -= x;
            }
            System.out.println(x);
        }
        sc.close();
    }
}
