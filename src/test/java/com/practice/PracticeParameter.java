package com.practice;

public class PracticeParameter {
	
	public void getSalary(int a, int b, int c) {
		System.out.println(a+b+c); 
	}
	public void getParameter(String myclass, boolean y) {
		System.out.println(myclass); 
		System.out.println(y);  
	}
	public static void main(String[] args) {
		PracticeParameter pp = new PracticeParameter();
		pp.getParameter("Tasmim", true);
		pp.getSalary(20, 33, 110);
		
	} 

}
