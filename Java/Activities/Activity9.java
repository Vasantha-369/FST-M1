package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        
        ArrayList<String> myList = new ArrayList<String>();
      
        myList.add("Leonard");
        myList.add("Sheldon");
        myList.add("Howard");
        myList.add("Rajesh");
        myList.add("Penny");
       
        
        System.out.println("Printing all the names:");
        for(String name:myList){
            System.out.println(name);
        }
        
        System.out.println("Retrieving third name in the list: " + myList.get(2));
        System.out.println("Is Chicku is in list: " + myList.contains("Chicku"));
        System.out.println("Size of the ArrayList: " + myList.size());
        
        myList.remove("Penny");
        
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}