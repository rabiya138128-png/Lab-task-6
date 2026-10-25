import java.util.HashMap;
import java.util.Map;

public class StudentMarks {
    public static void main(String[] args) {
        Map<String, String> studentMap = new HashMap<>();

        studentMap.put("260431", "Ali");
        studentMap.put("260432", "sara");
        studentMap.put("260433", "Ayesha");
        studentMap.put("260434", "Ahmad");
        studentMap.put("260435", "Maaz");
        
        System.out.println("--- All Student Records ---");
        System.out.println(studentMap);

        System.out.println("\nUpdating record for ID 260432 to Usman...");
        studentMap.put("260432", "Usman");

        System.out.println("Updated student at 260432: " + studentMap.get("260432"));

        System.out.println("Total number of students: " + studentMap.size());
    }
}