import java.util.Scanner;

public class WeekdayFinder {
    public static void main(String[] args) {
        // Array of weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask user for the day index
            System.out.print("Enter the day position (0-6): ");
            int dayIndex = scanner.nextInt();

            // Print the corresponding day name
            System.out.println("The day is: " + weekdays[dayIndex]);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception if index is out of range
            System.out.println("Error: Invalid day position. Please enter a number between 0 and 6.");
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}
