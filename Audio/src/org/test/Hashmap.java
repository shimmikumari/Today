package org.test;


import java.util.HashMap;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String>hm=new HashMap<Integer, String>();
hm.put(11, "Deep");//random order
hm.put(122, "Shimmi");
hm.put(1222, "Dipanshu");
hm.put(3333, "Sweta");
Set<Integer>allkeys=hm.keySet();
for(Integer i:allkeys) {
	System.out.println("key is"+i);
	System.out.println("value is"+hm.get(i));
}
	}

}
