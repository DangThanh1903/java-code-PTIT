import java.util.Scanner;

public class J02106_MaTranNhiPhan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int count0 = 0;
            int count1 = 0;
            for (int j = 0; j < 3; j++) {
                x = sc.nextInt();
                if (x == 1) count1++;
                else count0++;
            }
            if (count0 < count1) count++;
        }
        System.out.print(count);
        sc.close();
    }
}
