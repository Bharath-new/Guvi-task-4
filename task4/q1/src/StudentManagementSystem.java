public class StudentManagementSystem {
    public static void main(String[] args) {
        try {
            // Valid Student
            Student student1 = new Student(101, "Ramesh Kumar", 20, "Computer Science");
            System.out.println("Student Added: " + student1);

            // Invalid Age
            Student student2 = new Student(102, "Suresh Verma", 14, "Mathematics");
            System.out.println("Student Added: " + student2);

        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            // Invalid Name
            Student student3 = new Student(103, "An1l Kumar", 19, "Physics");
            System.out.println("Student Added: " + student3);

        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
