package org.test;

import java.util.Set;
import java.util.TreeMap;

public class Treemap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer, String>tm=new TreeMap<Integer, String>();
tm.put(134, "Reetu");
tm.put(111, "Sanu");
tm.put(100, "Queen");
tm.put(178, "Teena");
Set<Integer>allkeys=tm.keySet();
for(Integer i:allkeys) {
	System.out.println("key is"+i);
	System.out.println("value is"+tm.get(i));
}
	}

}
