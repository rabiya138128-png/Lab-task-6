import java.util.HashMap;
import java.util.Map;

public class StudentMarks {
    public static void main(String[] args) {
        Map<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Ali", 85);
        studentMarks.put("Sara", 92);
        studentMarks.put("Ayesha", 78);
        studentMarks.put("Hira", 90);
        studentMarks.put("Ahmed", 88);

        System.out.println("Student Marks:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }        
    
    }
}