public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Parameterized Constructor
    public Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        this.setName(name); // Validate name
        this.setAge(age);   // Validate age
        this.course = course;
    }

    // Set Age with Validation
    public void setAge(int age) throws AgeNotWithinRangeException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException(
                    "Age must be between 15 and 21. Provided age: " + age);
        }
        this.age = age;
    }

    // Set Name with Validation
    public void setName(String name) throws NameNotValidException {
        if (!name.matches("[a-zA-Z\\s]+")) { // Name should only contain alphabets and spaces
            throw new NameNotValidException(
                    "Name contains invalid characters: " + name);
        }
        this.name = name;
    }

    // Override toString to display student details
    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Course: " + course;
    }
}
