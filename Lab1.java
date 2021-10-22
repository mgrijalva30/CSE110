/*----------------------------------------------------------------------------------
// AUTHOR: MARIA GRIJALVA
// FILENAME: LAB 1 
// SPECIFICATION: THIS PROGRAM WILL COMPUTE 3 TEST SCORES TO GIVE THE AVERAGE SCORE.
// FOR: CSE 110- LAB #1
// TIME SPENT: 2 HOURS//-------------------------------------------------------------------
 ------------------------------------------------*/
import java.util.Scanner;

public class Lab1 {
	 
	public static void main(String[] args) {
	
	double test1, test2, test3; 
	
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter your first test score: "); //Display prompt
		test1 = in.nextInt();
		
		System.out.print("Please enter your second test score: "); //Display prompt
		test2 = in.nextInt();
		
		System.out.print("Please enter your third test score: "); // Display prompt
		test3 = in.nextInt();
	
	System.out.print("The score for test 1 is ");
	System.out.println(test1);
	System.out.print("The score for test 2 is ");
	System.out.println(test2);
	System.out.print("The score for test 3 is ");
	System.out.println(test3);
	
	final double AVG_SCORE = 3; //Compute test score average
	
	double testScore = (test1 + test2 + test3) / AVG_SCORE; //Compute test score average
	
		System.out.println("Your average score is " + testScore); //Display test score average
					
	}
	
}
