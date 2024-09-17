import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroups {

    public static void main(String[] args) {
        // Example list of student names
        List<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Eve");
        students.add("Frank");
        students.add("Hannah");
        students.add("Omar");

        // Create random groups of 3 students each
        List<List<String>> groups = createRandomGroups(students, 3);

        // Print the groups
        for (int i = 0; i < groups.size(); i++) {
            System.out.println("Group " + (i + 1) + ": " + groups.get(i));
        }
    }

    /**
     * Method to create random groups of students
     * @param students List of students
     * @param groupSize The size of each group
     * @return A list of groups, each group is a list of students
     */
    public static List<List<String>> createRandomGroups(List<String> students, int groupSize) {
        // Shuffle the list of students to randomize the order
        Collections.shuffle(students);

        // List to hold the groups
        List<List<String>> groups = new ArrayList<>();

        // Loop through the list and divide students into groups
        for (int i = 0; i < students.size(); i += groupSize) {
            // Get a sublist for each group, handling the last group which may be smaller
            List<String> group = students.subList(i, Math.min(i + groupSize, students.size()));
            groups.add(new ArrayList<>(group)); // Add each group to the list of groups
        }

        return groups;
    }
}
