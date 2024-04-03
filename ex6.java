import java.util.Scanner;

public class ex6 {
static double[] arr2 = new double[1000];
public static int creatarray()
{ 
    Scanner sc = new Scanner(System.in);
    System.out.print("Vui long nhap so phan tu trong mang : ");
    int a = sc.nextInt();
    for (int i=0;i<a;i++)
    {
        System.out.print("Nhap phan tu thu " + (i + 1) +": ");
        arr2[i] = sc.nextDouble();
    }
    sc.close();
    return a;
}
public static void display(int a)
{
    for (int i=0;i<a;i++)
    {
        System.out.print(arr2[i] +" ");
    }
    System.out.print("\n");
}
public static void ascending(int a)
{
    for (int i=0;i<a-1;i++)
    {
        for (int j=1;j<a;j++)
        {
            if (arr2[i] > arr2[j])
            {
                double mid = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = mid;
            }
        }
    }
    System.out.print("\n");
}
    public static void main(String[] args) {
        int n = creatarray();
        display(n);
        ascending(n);
        display(n);
    }
}