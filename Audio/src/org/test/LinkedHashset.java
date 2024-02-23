package org.test;

import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer>ls=new LinkedHashSet<Integer>();
		ls.add(122);//duplicate not allowed
		ls.add(122);//maintain the order
		ls.add(1233);
		ls.add(12334);
		ls.add(12334);
		ls.add(1233);
		for(Integer i:ls) {		
	System.out.println(i);			
		}	
	}

}
