package org.test;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap<Integer, String>hm=new LinkedHashMap<Integer, String>();
hm.put(122, "Suman");
hm.put(133, "Rahul");
hm.put(144, "Rakhi");
Set<Integer>allkeys=hm.keySet();
for(Integer i:allkeys) {
	System.out.println(" key is"+i);
	System.out.println("value is"+hm.get(i));
}
	}

}
