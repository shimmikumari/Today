package org.test;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer>ls=new LinkedList<Integer>();
ls.add(122);//duplicates are allowed
ls.add(122);// maintain the order(line by line)
ls.add(123);
ls.add(123);
ls.add(124);
ls.add(1256);
ls.add(12567);
for(Integer i:ls) {
	System.out.println(i);
}
	}

}
