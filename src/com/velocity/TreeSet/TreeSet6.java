package com.velocity.TreeSet;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSet6 {

	// Design method which return treeSet object to that method
	public TreeSet<Integer> getTreeSetDemo() {
		TreeSet<Integer> hs = new TreeSet<Integer>();
		hs.add(50);
		hs.add(20);
		hs.add(100);
		hs.add(45);
		return hs;
	}

	public static void main(String[] args) {

		TreeSet6 hashSetDemo6 = new TreeSet6();
		TreeSet<Integer> hs1 = hashSetDemo6.getTreeSetDemo();
		System.out.println(hs1);
	}
}
