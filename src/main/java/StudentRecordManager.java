import java.util.Map;
import java.util.TreeMap;

public class StudentRecordManager {
    private TreeMap<Integer, Student> studentRecords;

    // Constructor
    public StudentRecordManager() {
        studentRecords = new TreeMap<>();
    }

    // Add a new student record
    public void addStudent(int id, String name, double gpa) {
        if (!studentRecords.containsKey(id)) {
            Student student = new Student(id, name, gpa);
            studentRecords.put(id, student);
            System.out.println("Student added: " + student);
        } else {
            System.out.println("Error: Student ID " + id + " already exists.");
        }
    }

    // Delete a student record
    public void deleteStudent(int id) {
        if (studentRecords.containsKey(id)) {
            Student removed = studentRecords.remove(id);
            System.out.println("Student removed: " + removed);
        } else {
            System.out.println("Error: No student found with ID " + id);
        }
    }

    // Update a student's GPA
    public void updateGPA(int id, double newGPA) {
        Student student = studentRecords.get(id);
        if (student != null) {
            student.setGpa(newGPA);
            System.out.println("Student GPA updated: " + student);
        } else {
            System.out.println("Error: No student found with ID " + id);
        }
    }

    // Display all student records sorted by student ID
    public void displayAllRecords() {
        if (studentRecords.isEmpty()) {
            System.out.println("No records to display.");
        } else {
            System.out.println("All student records:");
            for (Map.Entry<Integer, Student> entry : studentRecords.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
    }

    // Display students with GPA higher than a specified value
    public void displayStudentsWithGPAHigherThan(double threshold) {
        boolean found = false;
        System.out.println("Students with GPA higher than " + threshold + ":");
        for (Student student : studentRecords.values()) {
            if (student.getGpa() > threshold) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students found with GPA higher than " + threshold);
        }
    }
}
