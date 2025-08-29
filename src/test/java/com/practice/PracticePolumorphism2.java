package com.practice;

public class PracticePolumorphism2 extends PracticePolymorphism1 {
	public void getEmployee(String name,int salary) {
		System.out.println("Tasmim's salary is now 10000"); 
	}

public static void main(String[] args) {
	PracticePolumorphism2 obj = new PracticePolumorphism2();
	obj.getEmployee("tasmim", 10000);
} 

}
