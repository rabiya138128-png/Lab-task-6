import java.util.HashMap;
import java.util.Map;

public class StudentMarks {
    public static void main(String[] args) {
        // Create a HashMap to store student names and their marks
        Map<String, Integer> studentMarks = new HashMap<>();

        // Adding student names and their corresponding marks
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 78);
        studentMarks.put("David", 90);
        studentMarks.put("Eva", 88);

        // Display the student marks
        System.out.println("Student Marks:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }        
    
    }
}