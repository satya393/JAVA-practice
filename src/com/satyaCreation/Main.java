package com.satyaCreation;

import com.satyaStreams.Str;

//import com.satyaLoop.*;

public class Main extends TestFour {

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

		if (size > 0) {
			System.out.println("true " + objLoop.length2);
		} else {
			System.out.println("false " + objLoop.length2);
		}

		// conditionMethos
		objLoop.conditionMethos();

//		package satyaStreams
		com.satyaStreams.Str objStream = new com.satyaStreams.Str();
		
		objStream.program1();
		objStream.program2();
		objStream.program3();
		objStream.program4();
		objStream.program5();
		objStream.program6();
		objStream.program7();
		objStream.program8();
        objStream.program9();
		objStream.program10();
	    objStream.program11();
		objStream.program12();
        objStream.program13();
//          objStream.program14();
//          objStream.program15();
//          objStream.program16();
//		

	}

}
