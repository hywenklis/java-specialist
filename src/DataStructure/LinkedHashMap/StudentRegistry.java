package DataStructure.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class StudentRegistry {
    public static void main(String[] args) {
        // Creating a LinkedHashMap to store student IDs and names.
        // Constructor parameters: initial capacity 4, load factor 0.75, accessOrder true.
        Map<Integer, String> studentMap = new LinkedHashMap<>(4, 0.75f, true);

        // Adding key-value pairs to the map.
        studentMap.put(104, "John");
        studentMap.put(102, "Mary");
        studentMap.put(103, "Peter");
        studentMap.put(101, "Anna");

        // Access a student to trigger reordering based on access.
        System.out.println("Accessed Student: " + studentMap.get(104));

        // Display all entries in the map.
        System.out.println("Students: " + studentMap);

        // Iterating over the map to print student IDs and names.
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            int id = entry.getKey();
            String name = entry.getValue();
            System.out.println("Student ID: " + id + ", Name: " + name);
        }

        // Check if a specific student exists in the map.
        int checkId = 101;
        if (studentMap.containsKey(checkId)) {
            String studentName = studentMap.get(checkId);
            System.out.println("Student ID " + checkId + " found: " + studentName);
        } else {
            System.out.println("Student ID " + checkId + " not found.");
        }

        // Removing a student from the map.
        studentMap.remove(103);
        System.out.println("Map after removing student with ID 103: " + studentMap);

        // Clearing the map.
        studentMap.clear();
        System.out.println("Map after clearing: " + studentMap);
    }
}
