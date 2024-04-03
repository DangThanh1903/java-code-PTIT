import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class J02017_ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> ar = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            ar.add(x);
        }
        while (true) {
            int ok = 0;
            for (int i = 0; i < ar.size() - 1; ) {
                if (((ar.get(i) + ar.get(i + 1)) % 2 == 0)) {
                    ar.remove(i);
                    ar.remove(i);
                    ok = 1;
                }
                else i++;
            }
            if (ok == 0) break;
        }
        System.out.print(ar.size());
        sc.close();
    }
}
