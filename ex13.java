import java.util.Scanner;
import java.util.ArrayList;

public class ex13 {
    static class A
    {
        int number;
        String name;
        double point;
    }
    static void creat(ArrayList<A> list,int n )
    { 
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<n;i++)
        {
            A a1 = new A();
            System.out.println("Vui long nhap thong tin hoc sinh thu "+ (i + 1));
            System.out.print("Ma so : ");
            a1.number = sc.nextInt();
            System.out.print("Ten sinh vien : ");
            a1.name = sc.next();
            System.out.print("Diem sinh vien : ");
            a1.point = sc.nextDouble();
            list.add(a1);
        }
        sc.close();
    }
    static void decreasing(ArrayList<A> list,int n)
    {
        int a = list.size();
        for (int i=0;i<a-1;i++)
        {
            for (int j=i+1;j<a;j++)
            {
                if (list.get(i).point < list.get(j).point)
                {
                    A a1 = new A();
                    a1.name = list.get(i).name;
                    a1.number = list.get(i).number ;
                    a1.point = list.get(i).point;
                    list.get(i).name = list.get(j).name;
                    list.get(i).number = list.get(j).number;
                    list.get(i).point = list.get(j).point;
                    list.get(j).name = a1.name;
                    list.get(j).point = a1.point;
                    list.get(j).number = a1.number;
                }
            }
        }
    }
    static void print(ArrayList<A> list,int n )
    { 
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<n;i++)
        {
            System.out.println("Ma so : " + list.get(i).number);
            System.out.println("Ten sinh vien : " + list.get(i).name);
            System.out.println("Diem sinh vien : " +
            list.get(i).point);
        }
        sc.close();
    }
    public static void main(String[] args) {
        ArrayList <A> arr = new ArrayList <A>();
        int n=5;
        creat(arr,n);
        decreasing(arr,n);
        print(arr,n);
    }
}