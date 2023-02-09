package com.satyaLoop;

public class TestFour {

	public void TestFour() {
		System.out.println("this is TestFour class srom package com.satyaLoop Strings");
		System.out.println("---------------------------------------------------------");

//		two types of variable declaration
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");// Because of new key word it will create object memory
		String s4 = new String("hello");

		System.out.println("//by using == we can compare only address");
		System.out.println(s1 == s2);// by using == we can compare only address

//		 normal variable declaration is not same as object declaration thats why its false 
		System.out.println("normal variable declaration is not same as object declaration thats why its false");
		System.out.println("//we can't compare variable and object");
		System.out.println(s2 == s3);// we can't compare variable and object

		System.out.println("//object s3 is not same as s4 because it contain different memory ");
		System.out.println(s3 == s4); // object s3 is not same as s4 because it contain different memory

		System.out.println("// by using equals method we can compare object data.");
		System.out.println(s3.equals(s4));// by using equals method we can compare object data.

	}
	
	
	
	
	public void methosList() {
		
		System.out.println(" methosList   ");
//		 string methods start:
		String[] method = { "charAt()", "codePointAt()", "codePointBefore()", "codePointCount()", "compareTo()",
				"compareToIgnoreCase()", "concat()", "contains()", "contentEquals()", "copyValueOf()", "endsWith()",
				"equals()", "equalsIgnoreCase()", "format()", "getBytes()", "getChars()", "hashCode()", "indexOf()",
				"intern()", "isEmpty()", "lastIndexOf()", "length()", "matches()", "offsetByCodePoints()",
				"regionMatches()", "replace()", "replaceFirst()", "replaceAll()", "split()", "startsWith()",
				"subSequence()", "substring()", "toCharArray()", "toLowerCase()", "toString()", "toUpperCase()",
				"trim()", "valueOf()" };

		int i;
		for (i = 0; i < method.length; i++) {    
			System.out.print( " "+method[i] + "|");
		}
		System.out.println();
		System.out.println("we have "+  i  + " no.of methods ");	
//		 string methods End:
	
	}

}
