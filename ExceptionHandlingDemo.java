package new2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// Collection --- interface
// List
// Set 
// Map 
public class ExceptionHandlingDemo  {

	public static void main(String[] args)  {
		
Map<String,String> obj = new HashMap<>();
	obj.put("Mobile Number", "renu");
	obj.compute("Mobile Number", (key,val) -> val.concat("kk"));
	System.out.println(obj);
	
	
}
}