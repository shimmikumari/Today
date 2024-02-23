package org.test;

import java.util.HashMap;
import java.util.Set;

public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String>hm=new HashMap<Integer, String>();
hm.put(123, "Surbhi");
hm.put(133, "Rahul");
hm.put(144, "Sweta");
hm.put(167, "Sweety");
Set<Integer>allkeys=hm.keySet();
for(Integer i:allkeys) {
	System.out.println("key is"+i);
	System.out.println("value is"+hm.get(i));
}
	}

}
