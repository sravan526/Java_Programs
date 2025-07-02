package Qe;

import java.util.HashMap;

	public class NumberToString 
	{
	    public static void main(String[] args) 
	    {
	        // Create a HashMap to map numbers to their names
	        HashMap<Integer, String> numberToName = new HashMap<>();

	        // Populate the HashMap with number-to-name mappings
	        numberToName.put(1, "One");
	        numberToName.put(2, "Two");
	        numberToName.put(3, "Three");
	        numberToName.put(4, "Four");
	        numberToName.put(5, "Five");
	        numberToName.put(6, "Six");
	        numberToName.put(7, "Seven");
	        numberToName.put(8, "Eight");
	        numberToName.put(9, "Nine");
	        // Add more mappings as needed...

	        // The number you want to convert to a string
	        int number = 42;
	                
	        

	        // Check if the number is present in the HashMap
	        if (numberToName.containsKey(number)) 
	        {
	            // Print the name of the number
	            String name = numberToName.get(number);
	            System.out.println("The name of " + number + " is " + name);
	            
	        } 
	        else 
	        {
	            System.out.println("Number not found in the HashMap.");
	        }
	    }
	}

