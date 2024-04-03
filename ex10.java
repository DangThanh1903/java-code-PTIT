import java.util.Scanner;

public class ex10 {
    public static void creatarray(double[] arr2)
    { 
        Scanner sc = new Scanner(System.in);
        int a=10;
        for (int i=0;i<a;i++)
        {
            System.out.print("Nhap phan tu thu " + (i + 1) +": ");
            arr2[i] = sc.nextDouble();
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
    public static double average(int[] array)
    {
        double sum=0;
        for (int i=0;i<10;i++)
        {
            sum += array[i];
        }
        return sum/10;
    }
    public static double average(double[] array)
    {
        double sum=0;
        for (int i=0;i<10;i++)
        {
            sum += array[i];
        }
        return sum/10;
    }
    public static void main(String[] args) {
        double[] arr2 = new double[1000];
        creatarray(arr2);
        int n = 10;
        display(n,arr2);
        double mid = average(arr2);
        System.out.print("\nTrung binh : " + mid);
    }
}