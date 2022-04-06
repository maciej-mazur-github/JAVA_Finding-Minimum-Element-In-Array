import java.util.Scanner;

public class MinimumFinder {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int count) {
        int[] array = new int[count];

        for(int i = 0; i < count; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int findMinimum(int[] array) {
        int minimum = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++) {
            if(array[i] <= minimum) {
                minimum = array[i];
            }
        }

        return minimum;
    }

    public static void main(String[] args) {
        System.out.print("How many elements do you need to enter to array?: ");
        int elementNumber = scanner.nextInt();

        System.out.println("\nThe minimum element is " + findMinimum(readIntegers(elementNumber)));
    }
}
