package com.satyaCreation;

//import com.satyaLoop.*;


public class Main  extends TestFour{

	public static void main(String[] args) {
		Main obj = new Main();
		obj.TestOne();
		obj.TestTwo();
		obj.TestThree();
		obj.TestFour();
		
		com.satyaLoop.Main objLoop = new com.satyaLoop.Main();
//		for loop
		objLoop.TestOne();
		
//		single Array
		objLoop.TestTwo();
		
//  two dimensional   
		objLoop.TestThree();
		
//	Array
		objLoop.TestFour();
		
//		method list
		objLoop.methosList();

		
		
		int size = objLoop.length2;
		
		if (size > 0  ) {
			System.out.println("true " +objLoop.length2);
		}else {
			System.out.println("false " +objLoop.length2);
		}

	
		
		
		
	}

}
