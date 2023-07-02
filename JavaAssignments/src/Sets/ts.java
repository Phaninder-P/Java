package Sets;
import java.util.*;

public class ts {
	 public static void main(String[] args)
	    {
	       
	        NavigableSet<String> ts = new TreeSet<>();
	  
	       
	        ts.add("Phani");
	        ts.add("NTR");
	        ts.add("Dhoni");
	        ts.add("University at Buffalo");
	        ts.add("University at Buffalo");
	  
	       
	        System.out.println(ts);
	        
	        String check = "NTR";
	        
	       
	        System.out.println("Contains " + check + " "
	                           + ts.contains(check));
	  
	     
	        System.out.println("First Value " + ts.first());
	  
	      
	        System.out.println("Last Value " + ts.last());
	  
	        String val = "Geek";
	  
	      
	        System.out.println("Higher " + ts.higher(val));
	        System.out.println("Lower " + ts.lower(val));
	    }
}
