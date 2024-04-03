import java.util.Scanner;

public class ex14 {
    static int k;
    public static void creatarray(int a,double[] arr2)
    { 
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<a;i++)
        {
            System.out.print("Nhap phan tu thu " + (i + 1) +": ");
            arr2[i] = sc.nextInt();
        }
        sc.close();
    }
    public static void display(int a, double[] arr2)
    {
        for (int i=0;i<a;i++)
        {
            System.out.print(arr2[i] +" ");
        }
        System.out.print("\n");
    }
    public static void result(double[] list, int a)
    { 
        double max = list[0];
        for (int i=1;i < list.length; i++)
        {
            if (list[i] > max) max = list[i];
        }
        for (int i=0;i < list.length; i++)
        {
            list[i] /= max;
        }
    }
    public static void main(String[] args) {
        int n=10;
        double[] arr2 = new double[1000];
        creatarray(n,arr2);
        result(arr2,n);
        display(n,arr2);
    }
}