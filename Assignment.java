import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the values of the elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        int highest = array[0];
        int lowest = array[0];
        int total = 0;

        for (int value : array) {
            if (value > highest) {
                highest = value;
            }
            if (value < lowest) {
                lowest = value;
            }
            total += value;
        }
        double average = (double) total / n;
        System.out.println("\nResults:");
        System.out.println("Highest value: " + highest);
        System.out.println("Lowest value: " + lowest);
        System.out.println("Average value: " + average);
    }
}
