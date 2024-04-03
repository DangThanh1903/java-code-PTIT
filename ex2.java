import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        char[] array = createArray();
        displayArray(array);
        int[] counts = countLetters(array);
        displayCounts(counts);
    }
    public static char[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        char[] array = new char[length];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.next().charAt(0);
        }
        scanner.close();
        return array;
    }
    public static void displayArray(char[] array) {
        System.out.print("Array: ");
        for (char element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static int[] countLetters(char[] array) {
        int[] counts = new int[26];
        for (char element : array) {
            if (Character.isLetter(element)) {
                int index = Character.toLowerCase(element) - 'a';
                counts[index]++;
            }
        }
        return counts;
    }
    public static void displayCounts(int[] counts) {
        System.out.println("Letter Counts:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'a') + ": " + counts[i]);
            }
        }
    }
}
