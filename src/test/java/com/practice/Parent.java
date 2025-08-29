package com.practice;

public class Parent extends GrandParent {

	@Override
	public void getSalary() {
	System.out.println("This is MultiLevel"); 
		
	}
public static void main(String[] args) {
	Parent obj = new Parent ();
	obj.getSalary();
} 
}
