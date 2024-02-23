package org.test;

import java.util.HashMap;
import java.util.Set;

public class Hashmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String>hm=new HashMap<Integer, String>();
hm.put(122, "Sweta");
hm.put(133, "Surbhi");
hm.put(144, "Deeap");
hm.put(155, "Sikha");
Set<Integer>allkeys=hm.keySet();
for(Integer i:allkeys) {
	System.out.println("key is"+i);
	System.out.println("value is"+hm.get(i));
}
	}

}
