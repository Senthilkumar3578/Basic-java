package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	  public static void main(String[] args) {
		
		  System.out.println("------------------Hash Map-----------------\n");
		  HashMap hs=new HashMap();
		  hs.put(1, "senthil");         //Insertion oreder not maintain
		  hs.put(2, "kumar");
		  hs.put(3, "Hemthath");
		  hs.put(4, "praveen");
		  hs.put(5, "karthick");
		  
		  System.out.println(hs);
		  
		  Map dub=new HashMap();
		  dub.putAll(hs);
		  System.out.println("Dubliacte map "+dub);
		  
		  dub.clear();
		  System.out.println(dub);
		  
		  System.out.println("contains key "+hs.containsKey(2));
		  
		  System.out.println("contains value "+hs.containsValue("kumar"));
		  
		  System.out.println("key set "+hs.keySet());
		  
		  System.out.println("get value "+hs.get(3));
		  
		  System.out.println("\n---------------Linked Hash Map-------------------\n");
		  
		  LinkedHashMap lhm=new LinkedHashMap();     //Insertion order maintain
		  lhm.put(1, "madurai");
		  lhm.put(2, "tiurchi");
		  lhm.put(3, "Kovai");
		  lhm.put(4, "praveen");
		  lhm.put(5, "karthick");
		  
		  System.out.println(lhm);
		  
		  
		  dub.clear();
		  System.out.println(dub);
		  
		  System.out.println("contains key "+lhm.containsKey(2));
		  
		  System.out.println("contains value "+lhm.containsValue("kumar"));
		  
		  System.out.println("key set "+lhm.keySet());
		  
		  System.out.println("get value "+lhm.get(3));
		  
		  System.out.println("\n------------------Tree map------------------\n");
		  
	
		      TreeMap tm1=new TreeMap();
		      
		      tm1.put("Hi", "Tn");            //Natural sorting order
		      tm1.put("iam", "Tn");
		      tm1.put("senthil", "Tn");
		      tm1.put("kumarr", "Tn");
		      
		      System.out.println(tm1);
		      

			  System.out.println("contains key "+tm1.containsKey("jv"));
			  
			  System.out.println("contains value "+tm1.containsValue("kumar"));
			  
			  System.out.println("key set "+tm1.keySet());
			  
			  System.out.println("get value "+tm1.get("senthil"));
		      
		      
		      
		      
		      
		  
		  
		  
	}
}
