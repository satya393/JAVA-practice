package com.satyaStreams;

import java.util.*;
import java.util.stream.*;

import com.satyaCreation.Main;

public class Str extends Main {
	
	
	private static void println(Object print) {
		System.out.println(print);
        }
	
	public void program1() {
		
		System.out.println("program1");
		System.out.println("--------");
		List<String> names = new ArrayList<String>();
		names.add("Akhil");
		names.add("Jival jelson");
		names.add("pavithra");
		names.add("sajid");
		names.add("avinash rachamalla");

		long totalCount = names.stream().filter(e -> e.length() > 6).count();  
		println(totalCount);
		println(names);
	}
		
		public void program2() {
			System.out.println("program2");
			System.out.println("--------");
			List<String> List = Arrays.asList("","satyam","satya",null,"");
			List<String> objList1 = List.stream().filter(e ->e != null).collect(Collectors.toList());
//	                                          //---------------------  . -------------------------//
			
			println(List); //      [, satyam, satya, ]
			println(objList1);//   [, satyam, satya, null, ]
			
			
			List<String> objList2 = List.stream().filter(Objects::nonNull).collect(Collectors.toList());
//			                                          //-------------------//
			println(objList2); //  [, satyam, satya, ]
		}
	
		
		public void program3() {
			System.out.println("program3");
			System.out.println("--------");
			System.out.println("nonNull, isBlank");
//			List<String> List = Arrays.asList("","satyam","satya",null,"");
//			Avoid null values in list and remove blank spaces
			List<String> List = Arrays.asList("","satyam","satya",null,"");
			List<String> objList3 = List.stream().filter(Objects::nonNull).filter(b -> !b.isBlank()).collect(Collectors.toList());			
			println(List );  //   [, satyam, satya, null, ]
			println(objList3);//  [satyam, satya]
		}

		
		public void program4() {
			System.out.println("program4");
			System.out.println("--------");
			System.out.println("nonNull, isBlank, map(u -> m.toUpperCase()),map(String::toUpperCase)");//filter and map  //map(String::toUpperCase)

//			 Avoid null values in list and apply Upper Case String
			List<String> List = Arrays.asList("","satyam","satya",null,"");
			List<String> objList4 = List.stream().filter(Objects::nonNull).filter(b -> !b.isBlank()).map(u -> u.toUpperCase()).collect(Collectors.toList());
			List<String> objList5 = List.stream().filter(Objects::nonNull).filter(b -> !b.isBlank()).map(String::toUpperCase).collect(Collectors.toList());                    
		
			
			println(List ); 	
			println(objList4);
			println(objList5);
			
		}
		
		public void program5() {
			System.out.println("program5");
			System.out.println("--------");
			System.out.println("nonNull, isBlank, map(u -> m.toUpperCase() + 's' )");//filter and map 
			
//			Avoid null values in list and remove blank spaces and apply Upper Case String then concat letter 's' to the string
			List<String> list = Arrays.asList("","satyam","satya",null,"");
			List<String> objList6 = list.stream().filter(Objects::nonNull).filter(e -> !e.isBlank()).map(c-> c.toUpperCase() + "'s").collect(Collectors.toList()); 
			println(list); //[, satyam, satya, null, ]
			println(objList6); //[SATYAM's, SATYA's]
			 //
		}
		
		public void program6() {
			System.out.println("program6");
			System.out.println("--------");
			System.out.println(".allMatch(Objects::isNull)");//filter and map 
			
//			allMatch -> is every element is null ?
			List<String> list = Arrays.asList("","satyam","satya",null,"");
			Boolean objList7 = list.stream().allMatch(Objects::isNull);
			println(objList7);
		}
		
		public void program7() {
			System.out.println("program7");
			System.out.println("--------");
			System.out.println(".anyMatch(Objects::isNull)");//filter and map 
			
//			 Determine whether any of the element in the list is null.
			List<String>  list = Arrays.asList("","satyam","satya",null,"");
			Boolean objList8 = list.stream().anyMatch(Objects::isNull);
			println(objList8);
		}
		
		public void program8() {
			System.out.println("program8");
			System.out.println("--------");
			System.out.println(".noneMatch(Objects::isNull)");//filter and map 
			
//			 Determine any element in the list is not null, If there's not null then print 'true'..else 'false'
			List<String> list = Arrays.asList("Sajid", "Bethan", " ");
			boolean objList9 = list.stream().noneMatch(Objects::isNull);		
			println(objList9);
			
			

			
		}
		
		public void program9() {
			
			System.out.println("program9");
			System.out.println("--------");
			System.out.println(".anyMatch(x -> x.equalsIgnoreCase(\"java\")||x.equalsIgnoreCase(\"kotlin\"))");//filter and map 

//			Search exact term by passing parameter using streams	
			
			List<String> list = Arrays.asList("java", "Kotlin", "", null);			
			boolean objList10 = list.stream().anyMatch(x -> x.equalsIgnoreCase("java")||x.equalsIgnoreCase("kotlin"));
			println(list);
			println(objList10);
			
		}
		
		public void program10() {
			System.out.println("program10");
			System.out.println("--------");
			System.out.println(".filter(Objects::nonNull).filter(c -> c.equalsIgnoreCase(\"java\")||c.equalsIgnoreCase(\"kotlin\")).collect(Collectors.toList())");//filter and map 

//			Filter null elements in list and search exact term using streams
			List<String> list = Arrays.asList("java", "Kotlin", "", null);
			List<String> objList11 = list.stream().filter(Objects::nonNull).filter(c -> c.equalsIgnoreCase("java")||c.equalsIgnoreCase("kotlin")).collect(Collectors.toList());
			
			println(objList11);
		}
		
		public void program11() {
			System.out.println("program11");
			System.out.println("----------");
			System.out.println(".filter(Objects::nonNull).anyMatch(c -> c.equalsIgnoreCase(\"java\"))");//filter,anyMatch
//			searchExactTermUsingIgnoreCaseList
			
			List<String> list = Arrays.asList("java", "Kotlin", "", null);
	                  
			Boolean objList12 = list.stream().filter(Objects::nonNull).anyMatch(c -> c.equalsIgnoreCase("java"));	
			println(objList12);
			
		}
	
		public void program12() {
			System.out.println("program12");
			System.out.println("----------");
			System.out.println(".distinct().sorted().collect(Collectors.toList())");
			
//			Remove the duplicate letters inside the list of integers and then sort
			
			List<Integer> list = Arrays.asList(7,5,1,9,2,3,7,8,7,9,1,5);
			List<Integer> objList13 = list.stream().distinct().sorted().collect(Collectors.toList());
		   println(list);
			println(objList13);
		}
		
		
		public void program13() {
			System.out.println("program13");
			System.out.println("----------");
			
//			Remove the duplicate letters inside the string and then sort
			
//			String  list1 = 	"jblgugalugauga";	
//			List<String> objList13 = Arrays.asList( list1.split("")).stream().distinct().sorted().collect(Collectors.joining())
  
			String list = "bbabdssssssssssssssssouu";
			println(Arrays.asList(list.split("")).stream().distinct().sorted().collect(Collectors.joining()));
			
		}
		
		
		
		
	
	
	}

	

	

