import java.util.Scanner;

public class ex12 {
    static int k;
    public static void creatarray(int a,int[] arr2)
    { 
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<a;i++)
        {
            System.out.print("Nhap phan tu thu " + (i + 1) +": ");
            arr2[i] = sc.nextInt();
        }
        sc.close();
    }
    public static void display(int a, int[] arr2)
    {
        for (int i=0;i<a;i++)
        {
            System.out.print(arr2[i] +" ");
        }
        System.out.print("\n");
    }
    public static int[] eliminateDuplicates(int[] list, int a)
    {
        boolean[] arr = new boolean[a];
        k=0;
        for (int i=0;i<a;i++)
        {
            arr[i] = true;
        }
        for (int i=0;i<a-1;i++)
        {
            if(arr[i] == true)
            {
                for (int j=i+1;j<a;j++)
                {
                    if (list[j] == list[i])
                    {
                        arr[j] = false;
                        k++;
                    }
                }
            }
        }
        System.out.print(k +"\n");
        int[] result = new int[k+1];
        int o=0;
        for (int i=0;i<a;i++)
        {
            if(arr[i] ==true)
            {
                result[o] = list[i];
                o++;
            }
        }
        System.out.print("\n");
        return result;
    }
    public static void main(String[] args) {
        int n=10;
        int[] arr2 = new int[1000];
        creatarray(n,arr2);
        display(n,arr2);
        int[]result = eliminateDuplicates(arr2, n);
        display(k,result);
    }
}