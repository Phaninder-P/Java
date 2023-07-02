package maps;
import java.util.HashMap;
public class hm {
	 public static void main(String[] args)
	    {
	       
	     
	        HashMap<String, Integer> map = new HashMap<>();
	  
	    
	        map.put("Tendulkar", 10);
	        map.put("Virat", 18);
	        map.put("Dhoni", 7);
	        map.put("Dhoni", 7);
	  
	        
	        System.out.println("Size of map is:- "
	                           + map.size());
	  
	       
	        System.out.println(map);
	  
	      
	        if (map.containsKey("Dhoni")) {
	  
	         
	            Integer a = map.get("Dhoni");
	  
	            
	            System.out.println("value for key"
	                               + " \"Dhoni\" is:- " + a);
	        }
	    }
}
