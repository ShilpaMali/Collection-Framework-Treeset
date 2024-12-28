package com.velocity.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		
		List al=new ArrayList(); //loosly coupled
		//ArrayList al=new ArrayList(); //tightly coupled
		//LinkedList l=new LinkedList();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		
	}
}
