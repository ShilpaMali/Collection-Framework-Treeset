package com.velocity.TreeSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//Generics Integer
public class TreeSet4 {

	public static void main(String[] args) {

		TreeSet hs=new TreeSet();
		hs.add(15);
		hs.add(50);
		hs.add(25);
		hs.add(80);
		// 2nd way- using iterator
		Iterator<Integer> itr = hs.iterator(); //itr contain 15 50 25 80
		while (itr.hasNext()) {
			System.out.println(itr.next()); //15 50 25 80
		}
	}
}
