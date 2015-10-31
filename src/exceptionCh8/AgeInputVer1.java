package exceptionCh8;


	/*
	Chapter 8 Sample Class: Class to input age
	File: AgeInputVer1.java
	*/
	import java.util.*;
	class AgeInputVer1 {
	private static final String DEFAULT_MESSAGE = "Your age: " ;
	private Scanner scanner;
	public AgeInputVer1 ( ) {
	scanner = new Scanner ( System.in ) ;
	}
	public int getAge () {
	return getAge ( DEFAULT_MESSAGE ) ;
	}
	
	//Using this service class, we can write a program that gets a person’s age and
	//replies with the year in which the person was born. Notice the program takes into consideration whether the person already had a birthday this year. Here’s the program:
	public int getAge ( String prompt ) {
		System.out.print ( prompt ) ;
		int age = scanner.nextInt () ;
		return age;
		}

}
