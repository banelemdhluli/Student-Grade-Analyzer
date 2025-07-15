import java.util.Scanner;

public class StudentGradeAnalyzer{

public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of students: ");
    int numStudents = input.nextInt(); // Store number of students

    // Create an array to store each student's marks
    int[] marks = new int[numStudents];
    int total = 0; // Variable to store the sum of all marks

    // Loop through each student to collect their mark
    for(int i= 0; i < numStudents; i++){
        // Ask for each student to collect their mark
        System.out.println("Enter mark for student" +(i + 1) + ":");
        marks[i] = input.nextInt(); // Store mark in an array
        total += marks[i]; // Add mark to total for average calculation

        // Determine grade based on mark using if else
        String grade ="";
        if(marks[i] >= 80){
            grade = "Distinction";
        }else if (marks[i] >= 60){
            grade = "Merit";
        }else if (marks[i] >= 50){
            grade = "Pass";
        }else{
            grade = "Fail";
        }

        // Output the grade
        System.out.println("Grade: " + grade);

        // Give feedback based on grade using a switch statement
        switch(grade){
            case "Distinction":
                System.out.println("Excellent performance");
                break;
            case "Merit":
                System.out.println("Good job, keep it up");
                break;
            case "Pass":
                System.out.println("You passed, but there's a room for improvement");
                break;
            case "Fail":
                System.out.println("You need to work harder"); // This shows if all these conditions are not met
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println();
    }
    // Calculate and display the average mark
    double average = (double) total / numStudents; // Cast to double to get decimal result
    System.out.println("Average mark: " + average); // Display average
}
}