import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J07008_DaySoConTangDan {
    public static List<String> res = new ArrayList<String>();
    public static void findArray(int n, int[] ans, int[] list) {
        List<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (ans[i] == 1) {
                temp.add(list[i]);
            }
        }
        if (temp.size() >= 2) {
            boolean test = true;
            for (int i = 0; i < temp.size() - 1; i++) {
                if (temp.get(i) >= temp.get(i + 1)) {
                    test = false;
                    break;
                }
            }
            if (test) {
                String x = "";
                for (int i = 0; i < temp.size(); i++) {
                    x += temp.get(i) + " ";
                }
                res.add(x);
            }
        }
    }

    public static void binaryArray(int n, int[] ans){
        int[] arr = new int[n];
        while (true) {
            int i = n - 1;
            while (arr[i] == 1 && i > 0) i--;
            if (i == 0 && arr[0] == 1) break;
            arr[i] = 1;
            for (int j = i + 1; j < n; j++) {
                arr[j] = 0;
            }
            findArray(n, arr, ans);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int num = sc.nextInt();
        int[] list = new int[num];
        for (int i = 0; i < num; i++) {
            list[i] = sc.nextInt();
        }
        binaryArray(num, list);
        Collections.sort(res);
        for (String i : res) {
            System.out.println(i);
        }
        sc.close();
    }    
}
