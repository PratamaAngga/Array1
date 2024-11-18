package Experiment;
import java.util.Scanner;
public class LineSearch20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of array elements : ");
        int kuota = sc.nextInt();
        int arrayInt[] = new int[kuota];
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Enter the array element " + i + " : ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.print("Enter the key you want to search for : ");
        int key = sc.nextInt();
        int result = -1;
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                result = i;
                break;
            }
        }
        if (result != -1) {
            System.out.println("The key in the array is located at index position " + result);
        } else {
            System.out.println("Key not found!");
        }
    }
}
