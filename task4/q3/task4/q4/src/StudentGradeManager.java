import java.util.HashMap;
import java.util.Scanner;

public class StudentGradeManager {

    // HashMap to store student names and their grades
    private HashMap<String, Integer> studentGrades;

    // Constructor to initialize the HashMap
    public StudentGradeManager() {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student and their grade
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student " + name + " with grade " + grade + " added successfully.");
    }

    // Method to remove a student by name
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student " + name + " removed successfully.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    // Method to display a student's grade by name
    public void displayStudentGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println("Grade of " + name + ": " + studentGrades.get(name));
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    // Main method
    public static void main(String[] args) {
        StudentGradeManager manager = new StudentGradeManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Grade Manager ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student Grade");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    int grade = scanner.nextInt();
                    manager.addStudent(name, grade);
                    break;

                case 2:
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    manager.removeStudent(nameToRemove);
                    break;

                case 3:
                    System.out.print("Enter student name to display grade: ");
                    String nameToDisplay = scanner.nextLine();
                    manager.displayStudentGrade(nameToDisplay);
                    break;

                case 4:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
