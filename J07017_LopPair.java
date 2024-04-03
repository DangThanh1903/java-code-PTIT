import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class Pair<value1, value2> {
    private value1 x;
    private value2 y;
    Pair(value1 x, value2 y) {
        this.x = x;
        this.y = y;
    }
    private boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return n >= 2;
    }
    public boolean isPrime() {
        return (isPrime((Integer) x) && isPrime((Integer) y));
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}

public class J07017_LopPair {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
