import java.io.FileNotFoundException;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

class Staff implements Comparable<Staff>{
    private String id, name;
    private boolean sex;
    private double salary;

    public Staff (String id, String name, boolean sex, double salary) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }
    public String getSex(boolean sex) {
        if (sex) return "nu";
        else return "nam";
    }
    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return id + " " + name + " " + getSex(sex) + " " + salary;
    }


    @Override
    public int compareTo(Staff o) {
        return name.compareTo(o.getName());
    }
}



public class DanhSachNhanVien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("nhanvien.dat"));
        Staff[] staffs = new Staff[3];
        for (int y = 0; y < 3; y++) {
            String input = sc.nextLine();
            String[] elemant = input.split("/");
            int z = 0;
            String id = "", name = "";
            boolean s = true;
            double salary = 0;
            for (String i : elemant) {
                if (z == 0) {
                    id = i;
                }
                if (z == 1) {
                    name = i;
                }
                if (z == 2) {
                    if (i == "true") s = true;
                    else s = false;
                }
                if (z == 3) {
                    salary = Integer.parseInt(i);
                }
                z++;
            }
            staffs[y] = new Staff(id, name, s, salary);
        }
        Arrays.sort(staffs);
        for (Staff i : staffs) {
            System.out.println(i);
        }
    }
}
