package com.functional;

import java.util.HashSet;
import java.util.Set;

public class PracticeHashSet {
	public Set<Integer> getHashSet() {
		Set<Integer> myset = new HashSet<>();
		myset.add(10);
		myset.add(12);
		myset.add(10);
		myset.add(14);
		myset.add(15);
		myset.remove(10);
		System.out.println(myset);  
		return myset;
	}
	public static void main(String[] args) {
		PracticeHashSet obj = new PracticeHashSet();
		obj.getHashSet();
	} 

}
