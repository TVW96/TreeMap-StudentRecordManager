public class Main {

    // Main method to test the functionalities
    public static void main(String[] args) {
        StudentRecordManager manager = new StudentRecordManager();

        // Adding student records
        System.out.println("Adding student records...");
        manager.addStudent(1, "Alice", 3.5);
        manager.addStudent(2, "Bob", 3.8);
        manager.addStudent(3, "Charlie", 3.2);
        manager.addStudent(4, "David", 3.7);
        manager.addStudent(5, "Eva", 2.9);

        // Display all student records to ensure they are sorted by student ID
        System.out.println("\nDisplaying all student records sorted by ID:");
        manager.displayAllRecords();

        // Update GPA of a student and show the updated list
        System.out.println("\nUpdating GPA for student with ID 3 (Charlie)... ");
        manager.updateGPA(3, 3.6);
        System.out.println("\nDisplaying all student records after GPA update:");
        manager.displayAllRecords();

        // Delete a student record and display the remaining records
        System.out.println("\nDeleting student with ID 2 (Bob)... ");
        manager.deleteStudent(2);
        System.out.println("\nDisplaying all student records after deletion:");
        manager.displayAllRecords();

        // Show all students with GPA higher than 3.0
        System.out.println("\nDisplaying students with GPA higher than 3.0:");
        manager.displayStudentsWithGPAHigherThan(3.0);
    }
}
