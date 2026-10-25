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

        // 3. Update the marks/name of one student (e.g., updating ID 260432)
        System.out.println("\nUpdating record for ID 260432 to Usman...");
        studentMap.put("260432", "Usman");

        // 4. Retrieve and display the record of a specific student
        System.out.println("Updated student at 260432: " + studentMap.get("260432"));

        // 5. Display the total number of students in the map
        System.out.println("Total number of students: " + studentMap.size());

    }
}