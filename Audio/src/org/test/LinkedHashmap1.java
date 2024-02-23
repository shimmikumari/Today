package org.test;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap<Integer, String>hm=new LinkedHashMap<Integer, String>();
hm.put(1222, "Neetu");
hm.put(1333, "Rahul");
hm.put(144, "rani");
hm.put(111, "Rashmi");
hm.put(177, "Suman");
Set<Integer>allkeys=hm.keySet();
for(Integer i:allkeys) {
	System.out.println("key is"+i);
	System.out.println("value is"+hm.get(i));
}
	}

}
