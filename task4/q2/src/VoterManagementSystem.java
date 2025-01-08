public class VoterManagementSystem {
    public static void main(String[] args) {
        try {
            // Valid Voter
            Voter voter1 = new Voter(101, "John Doe", 25);
            System.out.println("Voter Registered: " + voter1);

            // Invalid Voter
            Voter voter2 = new Voter(102, "Jane Smith", 16);
            System.out.println("Voter Registered: " + voter2);

        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            // Another Invalid Voter
            Voter voter3 = new Voter(103, "Alice Brown", 17);
            System.out.println("Voter Registered: " + voter3);

        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
