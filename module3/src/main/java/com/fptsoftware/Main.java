package com.fptsoftware;

import io.jitpack.Module1Util;
import io.jitpack.Module2Util;

public class Main {

	public static void main(String[] args) {
		
		Module1Util module = new Module1Util();
		String result = module.testMethod();
		System.out.println(result);
		
		Module2Util module2 = new Module2Util();
		module2.testMethod();
		
	}
	
}
