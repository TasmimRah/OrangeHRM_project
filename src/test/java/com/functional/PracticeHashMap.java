package com.functional;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class PracticeHashMap {
	public Map<String, String> getHashmap() {
		Map<String,String> mymap = new LinkedHashMap <>();
		mymap.put("Name", "Tasmim");
		mymap.put("City", "Deer park");
		mymap.put("State", "New York");
		mymap.put("Country", "USA");
		System.out.println(mymap); 
		return mymap;
		
	}
	
public static void main(String[] args) {
	PracticeHashMap obj = new PracticeHashMap();
	obj.getHashmap();
}   
}
