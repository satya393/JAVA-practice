package com.satyaLoop;

public class TestThree extends TestFour {

	public void TestThree() {
		System.out.println("multi dimansional array and jagged array");
		System.out.println("-----------------------------------------");

		int[][] a = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9 }, { 10, 11, 12, 13, 14 } };

		for (int i = 0; i < a.length; i++) {
//			To display row size
			System.out.println(i);
		}
		
		System.out.println("--------------------------");
		
		
		System.out.println("2nd time");
		for (int i = 0; i < a.length; i++) {
			int[] singleRow = a[i];
			for (int j = 0; j < singleRow.length; j++) {
				System.out.print(singleRow[j] + "  ");
			}
			System.out.println();
		}

	}

}
