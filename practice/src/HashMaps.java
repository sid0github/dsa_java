import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMaps {

    static void printStudentMarks(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Rahul", 85);
        map.put("priya", 92);
        map.put("amit", 78);
        map.put("sneha", 85);

        System.out.println("Rahul's marks: " +  map.get("Rahul"));
        System.out.println("amit exists: " + map.containsKey("amit"));

        System.out.println("Students: " + map.keySet());

        System.out.println("marks: " + map.values());

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    static void countFrequency(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int ele : arr){
            freq.put(ele, freq.getOrDefault(ele, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    static int firstUnique(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (freq.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }



    static void main(String[] args) {
        //printStudentMarks();

        //int[] arr = {2, 3, 2, 5, 3, 2, 7, 5};
        //countFrequency(arr);
        int[] arr = {4, 5, 1, 2, 1, 4, 5, 7};
        System.out.println(firstUnique(arr));
    }

}
