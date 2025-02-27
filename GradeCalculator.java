// File Naming Convention: GradeCalculator.java

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Get the student's score
        int score = getStudentScore();
        
        // Calculate the grade based on the score
        String grade = calculateGrade(score);
        
        // Display the calculated grade
        System.out.println("Your Grade is: " + grade);
    }

    // Method to get the student's score from the user
    public static int getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        
        // Read the user's input and return it as an integer
        int score = scanner.nextInt();
        
        // Optional: Validate the input (you can add more validation if needed)
        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
            return getStudentScore(); // Recursively call to get a valid score
        }
        
        return score;
    }

    // Method to calculate the letter grade based on the score
    public static String calculateGrade(int score) {
        String grade;
        
        // Determine the letter grade based on the score
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        return grade; // Return the calculated grade
    }
}
