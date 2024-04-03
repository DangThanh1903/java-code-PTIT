import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class J07031_CapSoNguyenToTrongFile2 {
    public static int[] prime = new int[1000005];


    // 0 is YES and 1 is NO
    public static void find() {
        prime[0] = prime[1] = 1;
        for (int i = 2; i <= 1000000; i++) {
            if (prime[i] == 0) {
                for (int j = i + i; j <= 1000000; j += i) {
                    prime[j] = 1; 
                }
            }
        }
    }
    

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        find();
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> al1 = (ArrayList<Integer>) ois1.readObject();
        Set<Integer> ts1 = new TreeSet<>();
        for (int i : al1) {
            if (prime[i] == 0) {
                ts1.add(i);
            }
        }

        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> al2 = (ArrayList<Integer>) ois2.readObject();
        Set<Integer> ts2 = new TreeSet<>();
        for (int i : al2) {
            if (prime[i] == 0) {
                ts2.add(i);
            }
        }
        final int SUM = 1000000;
        for (Integer i : ts1) {
            if (i * 2 >= SUM) {
                break;
            }
            if (ts1.contains(SUM - i) && !ts2.contains(SUM - i) && !ts2.contains(i)) {
                System.out.println(i + " " + (SUM - i));
            }
        }
    }  
}
