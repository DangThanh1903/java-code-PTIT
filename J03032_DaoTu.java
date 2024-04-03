import java.util.Scanner;

public class J03032_DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test-- > 0) {
            String str = sc.nextLine();
            String[] parts = str.split(" ");
            for (int i = 0; i < parts.length; i++) {
                StringBuilder str1 = new StringBuilder(parts[i]);
                parts[i] = str1.reverse().toString();
            }
            for (int i = 0; i < parts.length; i++) {
                System.out.print(parts[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
