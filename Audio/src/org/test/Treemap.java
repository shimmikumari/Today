package org.test;

import java.util.Set;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 TreeMap<Integer, String>tm=new TreeMap<Integer, String>();
 tm.put(122, "Sikha");
 tm.put(1222, "Rani");
 tm.put(145, "Varsha");
 tm.put(166, "Reetu");
 Set<Integer>allkeys=tm.keySet();
 for(Integer i:allkeys) {
	 System.out.println("key is"+i);
	 System.out.println("value is"+tm.get(i));
 }
	}

}
