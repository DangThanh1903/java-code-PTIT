import java.util.Scanner;

public class J01016_ChuSo4VaChuSo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '4' || n.charAt(i) == '7') count++;
        }
        if (count == 7 || count == 4) System.out.print("YES");
        else System.out.print("NO");
        sc.close();
    }
}
