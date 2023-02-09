package com.satyaCreation;

//import com.satyaLoop.*;

public class TestTwo extends TestOne {
	
	public void TestTwo() {
		
		System.out.println("this is TesTwo class 2.1");		
		TestTwo testTwo = new TestTwo();
//		 System.out.println("this is testTwo class ");
		 testTwo.TestOne();
		 System.out.println("2.2****");	 
		 
// this from com.satyaloop (test One class)
		  System.out.println("this is from testOne class to main class in main psackage  (1nd loop)");
		  com.satyaLoop.TestOne obj1 = new com.satyaLoop.TestOne();
		  obj1.TestOne();
		  
		  System.out.println("this is from testOne class to main class in main psackage  (2nd loop)");
         com.satyaLoop.Main obj2 = new com.satyaLoop.Main();
         obj2.TestOne();

   	  System.out.println("this is from testOne class to main class in main psackage end");   
		
	}
	 

}
