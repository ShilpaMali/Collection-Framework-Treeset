package com.velocity.TreeSet;

import java.util.LinkedHashSet;
import java.util.TreeSet;
//generic Integer
public class TreeSet5 {

	public static void main(String[] args) {

		TreeSet<Integer> hs=new TreeSet<Integer>();
		// how to add elements into hashset
		hs.add(15);
		hs.add(50);
		hs.add(25);
		hs.add(80);
		//3rd way- for each loop
		for(Integer i:hs) {
			System.out.println(i);
		}
	}
}
