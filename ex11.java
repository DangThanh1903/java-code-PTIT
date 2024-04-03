import java.util.Scanner;

public class ex11 {
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
    public static int indexOfLargestElement(double[] array)
    { 
        double max = array[0];
        int k=1;
        for (int i=1;i<10;i++)
        {
            if ( max <= array[i])
            {
                max = array[i];
                k=i;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        double[] arr2 = new double[1000];
        creatarray(arr2);
        int n=10;
        display(n,arr2);
        int result = indexOfLargestElement(arr2);
        System.out.print("\nIndex : "+result);
    }
}