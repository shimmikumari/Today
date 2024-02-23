package org.test;

import java.util.HashSet;

public class Hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer>hs=new HashSet<Integer>();
hs.add(122);// duplicates are not allowed
hs.add(122);//not maintain order
hs.add(123);
hs.add(123);
hs.add(124);
hs.add(124);
for(Integer i:hs) {
	System.out.println(i);
	}
	}
}
