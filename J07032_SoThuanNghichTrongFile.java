import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;

public class J07032_SoThuanNghichTrongFile {
    public static boolean findNum(String num) {
        int first = 0;
        int second = num.length() - 1;
        while(true) {
            if (Math.abs(first - second) <= 1) break;
            if (num.charAt(first) != num.charAt(second) || (num.charAt(first) - 48) % 2 == 0 || (num.charAt(second) - 48) % 2 == 0) return false;
            first++;
            second--;
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<String> l1 = (ArrayList<String>) o1.readObject();
        Set<String> ts1 = new TreeSet<>();
        int[] count = new int[1000005];
        for (String i : l1) {
            if (findNum(i)) {
                ts1.add(i);
                count[Integer.parseInt(i)]++;
            }
        }
        ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<String> l2 = (ArrayList<String>) o2.readObject();
        for (String i : l2) {
            if (findNum(i)) {
                ts1.add(i);
                count[Integer.parseInt(i)]++;
            }
        }
        Set<String> ts2 = new TreeSet<>();
        for (String i : ts1) {
            if (count[Integer.parseInt(i)] > 1 && count[Integer.parseInt(i)] % 2 == 1) {
                ts2.add(i);
            }
        }
        int counter = 0;
        for (String i : ts2) {
            System.out.println(i + " " + count[Integer.parseInt(i)]);
            counter++;
            if (counter == 10) break;
        }
        o1.close();
        o2.close();
    }    
}
