package com.test;

import com.generic.PracticeCrossBrowserTesting;

public class RunCrossBrowser {
	public static void main(String[] args) {
		PracticeCrossBrowserTesting obj = new PracticeCrossBrowserTesting();
		obj.getCrossbrowser("chrome");
		obj.getCrossbrowser("firefox");
	}    

}
