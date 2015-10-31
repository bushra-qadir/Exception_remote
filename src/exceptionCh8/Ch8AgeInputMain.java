package exceptionCh8;

/*
Chapter 8 Sample Program: Input a person's age
File: Ch8AgeInputMain.java
*/
import java.util.*;
public class Ch8AgeInputMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*GregorianCalendar today;
		int age, thisYear, bornYr;
		String answer;
		Scanner scanner = new Scanner ( System.in ) ;
		AgeInputVer1 input = new AgeInputVer1 ( ) ;
		age = input.getAge ( "How old are you? " ) ;
		today = new GregorianCalendar ( ) ;
		System.out.print ( today ) ;

		thisYear = today.get ( Calendar.YEAR) ;
		bornYr = thisYear - age;
		System.out.print ( "Already had your birthday this year? (Y or N)" ) ;
		answer = scanner.next () ;
		if ( answer.equals ( "N" ) || answer.equals ( "n" ) ) {
		bornYr--;
		}
		System.out.println ( "\nYou are born in " + bornYr ) ;
		
		

	}}*/
		Scanner scanner= new Scanner (System.in);
		try{
			while (true)
			{
				System.out.println("Enter input");
				int num=scanner.nextInt();
				
			}
			//int num1=scanner.nextInt();
			//System.out.println("Input1 accepted");
			//int num2=scanner.nextInt();
			//System.out.println("Input2 accepted");
		}
			catch (InputMismatchException e){
				scanner.next();
				System.out.println("Invalid entry");
			}
			
			
			
		}

}
