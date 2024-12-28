package com.velocity.TreeSet;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {

		TreeSet ts=new TreeSet();
		ts.add(15);
		ts.add(50);
		ts.add(25);
	    //ts.add("pune"); //heterogenous object
		ts.add(80);
		ts.add(10);
		//ts.add(null);
		//1st way- direct way
		System.out.println(ts);
	}
}
