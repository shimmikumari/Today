package org.test;

import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Integer>ts=new TreeSet<Integer>();
ts.add(122); //duplicates are not allowed
ts.add(1234);// Ascending order
ts.add(122);
ts.add(1234);
ts.add(122222);
ts.add(11111);
for(Integer i:ts) {
	System.out.println(i);
}
	}

}
