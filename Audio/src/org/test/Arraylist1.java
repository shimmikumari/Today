package org.test;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("changeg done by shimmi");
ArrayList<Integer>as=new ArrayList<Integer>();
as.add(122);//duplicates are allowed
as.add(123);//maintain the order
as.add(1333);
as.add(1333);
as.add(122);
as.add(123);
for(Integer i:as) {
	System.out.println(i);
	
}
	}

}
