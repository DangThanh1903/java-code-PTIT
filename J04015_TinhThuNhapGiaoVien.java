import java.util.Scanner;

class wageOfTeacher {
    private String id, name;
    private long wage;
    public wageOfTeacher() {
        id = "";
        name = "";
        wage = 0;
    }
    public wageOfTeacher(String id, String name, long wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public long getWage() {
        return wage;
    }
    public int getWageMulti() {
        int multiply;
        multiply = ((int)id.charAt(id.length() - 2) - 48)*10 + (int)id.charAt(id.length() - 1) - 48;
        return multiply;
    }
    public long getAllowance() {
        if (id.charAt(1) == 'P') return 900000;
        else if (id.charAt(1) == 'T') return 2000000;
        else return 500000;
    }
    public long getFinalWage() {
        return wage * getWageMulti() + getAllowance();
    }

    @Override
    public String toString() {
        return getId() + " " + getName() + " " + getWageMulti() + " " + getAllowance() + " " + getFinalWage();
    }
}



public class J04015_TinhThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        long wage = sc.nextLong();
        wageOfTeacher wot = new wageOfTeacher(id, name, wage);
        System.out.println(wot);
        sc.close();
    }
}
