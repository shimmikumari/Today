package org.test;

import java.util.HashSet;

public class Hashset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer>hs=new HashSet<Integer>();
hs.add(122);//duplicates not allowed
hs.add(122);// not maintain order
hs.add(11111);
hs.add(122222);
hs.add(11111);
hs.add(122222);
for(Integer i:hs) {
	System.out.println(i);
}
	}

}
