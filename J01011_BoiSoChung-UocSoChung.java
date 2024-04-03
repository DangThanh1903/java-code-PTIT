import java.util.Scanner;

public class J01011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long ans = a*b;
            while (a != b){
                if (a > b){
                    a -= b; // a = a - b
                }else{
                    b -= a;
                }
            }
            System.out.println(ans/a + " " + a);
            test--;
        }
        sc.close();
    }
}
