package com.velocity.TreeSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {

		TreeSet hs=new TreeSet();
		// how to add elements into hashset
		hs.add(15);
		hs.add(50);
		hs.add(25);
		hs.add(80);
		//2nd way- using iterator
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
