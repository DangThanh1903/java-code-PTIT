import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;


public class J02006_HopCuaHaiSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> s = new TreeSet<>();
        for (int i = 0; i < n + m; i++) {
            int x = sc.nextInt();
            s.add(x);
        }
        Iterator<Integer> iter = s.iterator();
        while (iter.hasNext()) {
            System.out.printf("%d ", iter.next());
        }
        sc.close();
    }
}
