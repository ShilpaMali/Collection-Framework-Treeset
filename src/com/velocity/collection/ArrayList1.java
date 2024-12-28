package com.velocity.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(10);
		al.add(20);
		HashSet hs=new HashSet(al);
		System.out.println(hs);
		
	}
}
