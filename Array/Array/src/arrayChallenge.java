import java.util.Arrays;
import java.util.Scanner;

public class arrayChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myNumbers = getIntegers(5); // You can change 5 to any number of integers you want to enter
        System.out.println("Entered integers:");
        printArray(myNumbers);
        System.out.println("Sorted integers in descending order:");
        printArray(sortIntegers(myNumbers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r ");
        int[] numbers = new int[number];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static int[] sortIntegers(int[] numbers) {
        // Sort the numbers in ascending order
        Arrays.sort(numbers);

        // Reverse the sorted numbers to get them in descending order
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }

        return numbers;
    }
}
