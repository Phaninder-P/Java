package maps;
import java.util.*;

public class lhm {
	public static void main(String a[])
    {
  
       
        LinkedHashMap<String, String> lhm
            = new LinkedHashMap<String, String>();
  
        
        lhm.put("one", "phani");
        lhm.put("two", "dhoni");
        lhm.put("four", "ntr");
        lhm.put("four", "ntr");
  
   
        System.out.println(lhm);
  
        
        System.out.println("Getting value for key 'one': "
                           + lhm.get("one"));
  
        
        System.out.println("Size of the map: "
                           + lhm.size());
  
        
        System.out.println("Is map empty? "
                           + lhm.isEmpty());
  
        
        System.out.println("Contains key 'two'? "
                           + lhm.containsKey("two"));
  
        
        System.out.println(
            "Contains value 'practice.geeks"
            + "forgeeks.org'? "
            + lhm.containsValue("practice"
                                + ".geeksforgeeks.org"));
  
      
        System.out.println("delete element 'one': "
                           + lhm.remove("one"));
  
      
        System.out.println("Mappings of LinkedHashMap : "
                           + lhm);
    }
}
