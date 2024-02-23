package org.test;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashmap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap<Integer, String>hm=new LinkedHashMap<Integer, String>();
hm.put(122, "Ranu");
hm.put(145, "Rekha");
hm.put(156, "Lalita");
hm.put(189, "Raju");
Set<Integer>allkeys=hm.keySet();
for(Integer i:allkeys) {
	System.out.println("key is"+i);
	System.out.println("value is"+hm.get(i));
}
	}

}
