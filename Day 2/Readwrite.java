import java.util.*;
import java.io.*;
import java.util.stream.*;
public class Readwrite {
    public static void main(String[] args) {
        List<Integer> marksList = new ArrayList<>();
        try {
            File file = new File("marks.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextInt()) {
                marksList.add(scanner.nextInt());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        System.out.println("Original marks: " + marksList);
         List<Integer> filteredSortedMarks = marksList.stream()
            .filter(mark -> mark >= 60)
            .sorted()
            .collect(Collectors.toList());
        
        System.out.println("Filtered (>=60) and sorted marks: " + filteredSortedMarks);
        
       
    }
}
