public class Voter {
    private int voterId;
    private String name;
    private int age;

    // Parameterized Constructor
    public Voter(int voterId, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voter. Age must be 18 or older.");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Override toString to display voter details
    @Override
    public String toString() {
        return "Voter ID: " + voterId + ", Name: " + name + ", Age: " + age;
    }
}
