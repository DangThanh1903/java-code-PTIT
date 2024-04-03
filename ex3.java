import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int[] array = createArray();
        System.out.println("Original Array:");
        displayArray(array);
        int[] reversedArray = reverseArray(array);
        System.out.println("Reversed Array:");
        displayArray(reversedArray);
 }
public static int[] createArray() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = scanner.nextInt();
    int[] array = new int[size];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
        array[i] = scanner.nextInt();
    }
    scanner.close();
    return array;
}
    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[array.length - i - 1] = array[i];
        }
        return reversedArray;
    }
}
