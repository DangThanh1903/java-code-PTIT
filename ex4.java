import java.util.Scanner;

public class ex4 {
    static double[] arr2 = new double[1000];
    public static int creatarray(){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap so phan tu trong mang: ");
        int a = sc.nextInt();
        for (int i=0;i<a;i++){
            System.out.print("Nhap phan tu thu " + i +": ");
            arr2[i] = sc.nextDouble();
        }
        sc.close();
        return a;
    }
    public static void display(int a){
        for (int i=0; i<a; i++){
            System.out.print(arr2[i] +" ");
        }
        System.out.print("\n");
    }
    public static double sumarray(int a){
        double sum=0;
        for (int i=0; i<a; i++){
            sum += arr2[i];
        }
        return sum;
    }
    public static double maxmin(int a, int b){
        if(b==0) {
        double min=arr2[0];
        for (int i=1; i<a; i++){
            if(arr2[i] < min)min= arr2[i];
        }
        return min;
        }
        else
        {
            double max=arr2[0];
            for (int i=1; i<a; i++){
            if(arr2[i] > max)max= arr2[i];
            }
            return max;
        }
    }
    public static void main(String[] args) {
        int n = creatarray();
        display(n);
        System.out.print(sumarray(n)+"\n");
        System.out.print("min = "+maxmin(n,0)+"\n");
        System.out.print("max = "+ maxmin(n,1)+"\n");
    }
}