package com.practice;

public class PracticeReverseLoop {
	public void getSalary(String name) {
		for(int i=(name.length()-1);i>=0;i--) {
			System.out.println(name.charAt(i)); 
		}
	}
	public void getStringBuilder(String name) {
		StringBuilder sb = new StringBuilder(name);
		System.out.println(sb.reverse());   
	}
	
	
	
	
	public static void main(String[] args) {
		PracticeReverseLoop obj = new PracticeReverseLoop();
		//obj.getSalary("Bangladesh");
		obj.getStringBuilder("Niju");
	}   


}
