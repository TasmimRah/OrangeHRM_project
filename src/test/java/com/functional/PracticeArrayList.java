package com.functional;

import java.util.ArrayList;
import java.util.List;

;

public class PracticeArrayList {
	public List<Integer> getArrayList() {
		List<Integer> mylist = new ArrayList<>();
		mylist.add(2);
		mylist.add(10);
		mylist.add(22);
		mylist.add(27);
		System.out.println(mylist); 
		return mylist;
	}
	
	public static void main(String[] args) {
		PracticeArrayList obj = new PracticeArrayList();
		obj.getArrayList();
	} 
}