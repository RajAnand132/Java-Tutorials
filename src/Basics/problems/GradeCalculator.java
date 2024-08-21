package Basics.problems;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter score : ");
                int score1 = sc.nextInt();
                // Determine and print grade for the first score
                String grade;
                if (score1 < 0 || score1 > 100) {
                    grade = "Invalid score";
                } else if (score1 >= 90) {
                    grade = "Grade: A";
                } else if (score1 >= 80) {
                    grade = "Grade: B";
                } else if (score1 >= 70) {
                    grade = "Grade: C";
                } else if (score1 >= 60) {
                    grade = "Grade: D";
                } else {
                    grade = "Grade: F";
                }
                System.out.println("Score: " + score1 + " -> " + grade);

    }
}
