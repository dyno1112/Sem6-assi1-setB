import java.util.*;

public class Q2 
{
    public static void main(String[] args) 
    {
        HashMap<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Tiger", 3);
        unsortedMap.put("Mango", 1);
        unsortedMap.put("Dog", 2);
        unsortedMap.put("Crow",0);

        System.out.println("HashMap before sorting:");
        printMap(unsortedMap);

        // Sort the HashMap by keys using a TreeMap
        TreeMap<String, Integer> sortedMap = new TreeMap<>(unsortedMap);

        System.out.println("\nHashMap after sorting by keys:");
        printMap(sortedMap);
    }

    public static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
