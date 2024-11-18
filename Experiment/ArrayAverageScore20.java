package Experiment;
import java.util.Scanner;
public class ArrayAverageScore20 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Input the number of student : ");
       int students = sc.nextInt();
        int score[] = new int[students];
        double totalPassed = 0, totalFailed = 0;
        double averagePassed, averageFailed;
        int studentPassed = 0, studentFailed = 0;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter student score " + (i + 1) + " : ");
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < score.length; i++) {
            if (score[i] > 70) {
                totalPassed += score[i];
                studentPassed++;
            } else if (score[i] <= 70) {
                totalFailed += score[i];
                studentFailed++;
            }
        }
        averagePassed = (studentPassed > 0) ? totalPassed /studentPassed : 0;
        averageFailed = (studentFailed > 0) ? totalFailed /studentFailed : 0;
        System.out.println("The average score of students who passed is " + averagePassed);
        System.out.println("The average score of students who failed is " + averageFailed);
    }
}
