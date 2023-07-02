package Sets;
import java.io.*;
import java.util.*;

public class hs {
	public static void main(String[] args)
    {
        // Instantiate an object of HashSet
        HashSet<ArrayList> set = new HashSet<>();
  
        // create ArrayList list1
        ArrayList<String> list1 = new ArrayList<>();
  
        // create ArrayList list2
        ArrayList<String> list2 = new ArrayList<>();
  
        // Add elements using add method
        list1.add("Phani");
        list1.add("NTR");
        list2.add("Phani");
        list2.add("NTR");
        set.add(list1);
        set.add(list2);
  
        // print the set size to understand the
        // internal storage of ArrayList in Set
        System.out.println(" "+ list1);
        
        Iterator<String> itr = list1.iterator();
        
        while(itr.hasNext())
        
        System.out.println(itr.next());
    }

}
