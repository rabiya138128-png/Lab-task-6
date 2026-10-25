import java.util.HashMap;
import java.util.Map;

public class StudentMarks {
    public static void main(String[] args) {
        Map<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 78);
        studentMarks.put("David", 90);
        studentMarks.put("Eva", 88);

        System.out.println("Student Marks:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }        
    
    }
}