
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Given a String array, where each entry represents the name and marks of the student.
// Find the average marks scored by each of these students?
 
// Input :
// String[] input = ["Akash 78", "Bharat 89", "Akash 90", "Akash 70", "Chetan 67", "Bharat 88", "Bharat 94", "Chetan 84"]
// Output:
// Akash : (78 + 90 + 70)/3
// Bharat: (89 + 88 + 94)/3
// Chetan: (67 + 84)/2

public class AverageMarks{

    public static void main(String args[]){

        String[] input = {"Akash 78", "Bharat 89", "Akash 90", "Akash 70", "Chetan 67", "Bharat 88", "Bharat 94", "Chetan 84"};
      
        Map<String, List<Integer>> studentMarks = new HashMap<>();
       
        for(String mark: input){
            String[] parts = mark.split(" ");
            String name = parts[0];
            int mark1 = Integer.parseInt(parts[1]);

            studentMarks.putIfAbsent(name,new ArrayList<>());
            studentMarks.get(name).add(mark1);
        }

        System.out.println("Average Marks of Each Student");

        for(Map.Entry<String,List<Integer>> data : studentMarks.entrySet()){
            String name = data.getKey();
            List<Integer> marksNos = data.getValue();

            double averageMark = marksNos.stream().mapToInt(Integer::intValue).average().orElse(0.0);
            System.out.println(name + " " + averageMark);
        }

    }

}