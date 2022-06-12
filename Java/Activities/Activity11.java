package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Blue");
        map.put(2, "Green");
        map.put(3, "Red");
        map.put(4, "Yellow");
        map.put(5, "Teal");

        // Print the Map
        System.out.println("The Original map: " + map);
        
      
        map.remove(4);

        System.out.println("After removing Yellow: " + map);
        
        // Check if green exists
        if(map.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }
        
        // Print the size of the Map
        System.out.println("Number of pairs in the Map is: " + map.size());
    }
}
