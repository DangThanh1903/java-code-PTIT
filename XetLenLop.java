import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

class Student {

    public static int num_student = 1;
    private String id, name, chucVu;
    private float toan, van ,anh;

    public Student() {
        id = "null";
        name = "null";
        toan = 0;
        van = 0;
        anh = 0;
        chucVu = "null";
    }


    public Student(String name, float toan, float van, float anh, String chucVu) {
        this.id = "HS" + String.format("%03d", num_student++);
        this.name = name;
        this.toan = toan;
        this.van = van;
        this.anh = anh;
        this.chucVu = chucVu;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        if (chucVu == "LT") return (toan + van + anh)/3 + 0.4;
        if (chucVu == "LP") return (toan + van + anh)/3 + 0.2;
        else return (toan + van + anh)/3;
    }

    public String getPass() {
        if (toan == 0 || van == 0|| anh == 0 || getGpa() < 5) return "HOC LAI";
        if (toan < 5 || van < 5 || anh < 5 || (getGpa() < 6.5 && getGpa() > 5)) return "Trung binh";
        if (getGpa() >= 6.5 && getGpa() < 8) return "Kha";
        return "Gioi";
    }

    @Override
    public String toString() {
        return String.format(getId() + " " + getName() + " " + String.format("%.1f", getGpa()) + " " + getPass());
    }
}



public class XetLenLop {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < test; i++) {
            String name = sc.nextLine();
            int toan = sc.nextInt();
            int van = sc.nextInt();
            int anh = sc.nextInt();
            sc.nextLine();
            String chucVu = sc.nextLine();
            Student st = new Student(name, toan, van, anh, chucVu);
            System.out.println(st);
        }
        sc.close();
    }
}
