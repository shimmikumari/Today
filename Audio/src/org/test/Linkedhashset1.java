package org.test;

import java.util.LinkedHashSet;

public class Linkedhashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet<Integer>hs=new LinkedHashSet<Integer>();
hs.add(122);//duplicate not allowed
hs.add(123);// maintain the order
hs.add(122);
hs.add(111);
hs.add(1000);
hs.add(100);
	for(Integer i:hs) {
		System.out.println(i);
	}
	}

}
