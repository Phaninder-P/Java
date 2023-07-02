package Sets;
import java.util.*;

public class lhset {
	 public static void main(String[] args)   
	    {   
//	        // creating LinkedHashSet using the Set  
//	        Set<String> data = new LinkedHashSet<String>();   
//	    
//	        data.add("JavaTpoint");   
//	        data.add("Set");   
//	        data.add("Example");   
//	        data.add("Set");   
//	    
//	        System.out.println(data);   
		 Set<String> data = new LinkedHashSet<String>();
		 data.add("Phani");
		 data.add("Dhoni");
		 data.add("NTR");
		 data.add("JavaTpoint");   
	        data.add("Set");   
	        data.add("Example");   
	        data.add("Set");  
		 
	        System.out.println("Size of LinkedHashSet = "
                    + data.size());

 System.out.println("Original LinkedHashSet:"
                    + data);

 // Removing existing entry from above Set
 // using remove() method
 System.out.println("Removing Set from LinkedHashSet: "
                    + data.remove("Set"));

 // Removing existing entry from above Set
 // that does not exist in Set
 System.out.println(
     "Trying to Remove Z which is not "
     + "present: " +data.remove("Z"));

 // Checking for element whether it is present inside
 // Set or not using contains() method
 System.out.println("Checking if A is present="
                    + data.contains("NTR"));

 // Noew lastly printing the updated LinkedHashMap
 System.out.println("Updated LinkedHashSet: "
                    + data);
	    }   
}
