package com.functional;

import java.util.LinkedList;
import java.util.List;

public class PracticeLinkedList {
	public List<Integer>  getLinkedList() {
		List<Integer> mylist = new LinkedList<>();
		mylist.add(2);
		mylist.add(10);
		mylist.add(22);
		mylist.add(27);
	
		System.out.println(mylist);    
		return mylist;
	}

	public static void main(String[] args) {
		PracticeLinkedList obj = new PracticeLinkedList();
		obj.getLinkedList();
	} 

}
