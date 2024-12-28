package com.velocity.TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {

		TreeSet hs=new TreeSet();
		hs.add(15);
		hs.add(50);
		hs.add(25);
		hs.add(80);
		//3rd way- for each loop
		for(Object obj:hs) {
			System.out.println(obj);
		}
	}
}
