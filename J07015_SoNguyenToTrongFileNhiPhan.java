import java.util.List;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class J07015_SoNguyenToTrongFileNhiPhan {
    public static boolean isPrime(long num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> list = (List<Integer>) sc.readObject();
        int[] used = new int[10000];
        for (Integer u : list){
            if (isPrime(u)) used[u]++;
        }
        for (int i = 2; i < 10000; i++) {
            if (used[i] != 0) System.out.println(i + " " + used[i]);
        }
        sc.close();
    }    
}
