package org.test;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>as=new ArrayList<Integer>();
as.add(122);//duplicates are allowed
as.add(123);//maintain order
as.add(144);
as.add(122);
as.add(123);
as.add(123);
as.add(144);
for(Integer i:as) {
	System.out.println(i);
}
	}

}
