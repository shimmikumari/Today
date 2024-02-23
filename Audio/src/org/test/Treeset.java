package org.test;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Integer>ts=new TreeSet<Integer>();
ts.add(122);//duplicates not allowed
ts.add(123);// accending order
ts.add(124);
ts.add(122);
ts.add(123);
ts.add(1246);
for(Integer i:ts){
	System.out.println(i);
	
}
	}

}
