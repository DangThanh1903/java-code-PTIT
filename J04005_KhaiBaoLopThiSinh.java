import java.util.Scanner;

class Student {
    private String name;
    private float sub1, sub2, sub3;
    private String birth;
    public Student(String name, String birth, float sub1, float sub2, float sub3) {
        this.name = name;
        this.birth = birth;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
    public String getName() {
        return name;
    }
    public String getBirth() {
        return birth;
    }
    public float getSub1() {
        return sub1;
    }
    public float getSub2() {
        return sub2;
    }
    public float getSub3() {
        return sub3;
    }
    public float find() {
        return getSub1() + getSub2() + getSub3();
    }
    @Override
    public String toString() {
        return getName() + " " + getBirth() + " " + find();
    }
}


public class J04005_KhaiBaoLopThiSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String birth = sc.nextLine();
        float sub1 = sc.nextFloat();
        float sub2 = sc.nextFloat();
        float sub3 = sc.nextFloat();
        Student st = new Student(name, birth, sub1, sub2, sub3);
        System.out.println(st);
        sc.close();
    }
}
