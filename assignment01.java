// CSE 110 : <#7564> / <NOT SPECIFIED> 
// ASSIGNMENT : <ASSIGNMENT 01>
// AUTHOR : <MARIA GRIJALVA> <ID#:1224167256>
/* DESCRIPTION : <A PROGRAM TO DETERMINE HOW TO SPLIT A # OF PIZZAS AMONG A GROUP OF ADULTS
 * 					AND CHILDREN AT A PIZZA PARTY.>
 */

import java.util.Scanner;
	public class Assignment01 {
		public static void main(String[] args) {

//DECLARE AND INITIATE SCANNER
	Scanner in = new Scanner(System.in);
	
//DECLARE VARIABLES FOR INPUT			
	int numPizza, numSlices, numAdults, numChildren; //INITIALIZE VARIABLES FIRST
		
//DECLARE VARIABLES FOR OUTPUT
	int totalSlices, totalGivenAdults, totalAvailChildren, totalEachChild, leftOvers; //INITIALIZE OUTPUTS SECOND

//PROMPT FOR AND COLLECT INPUTS
		System.out.print("Number of pizzas purchased: "); //PROMPT
		numPizza = in.nextInt(); //GETTING INPUT FROM USER
		System.out.print("Number of slices per pizza: "); //PROMPT
		numSlices = in.nextInt(); //GETTING INPUT FROM USER
		System.out.print("Number of adults: "); //PROMPT
		numAdults = in.nextInt(); //GETTING INPUT FROM USER
		System.out.print("Number of children: "); //PROMPT
		numChildren = in.nextInt(); //GETTING INPUT FROM USER
		
//COMPUTE REQUIRED VALUES
		totalSlices = numPizza * numSlices; //MULTIPLY #OF PIZZAS WITH #OF SLICES
		totalGivenAdults = numAdults * 2; //MULTIPLY #OF ADULTS WITH 2/WHICH IS THE AMOUNT EACH ADULT IS GETTING
		totalAvailChildren = totalSlices - totalGivenAdults; //SUBSTRACT THE TOTAL #OF SLICES WITH THE TOTAL #OF ADULTS GETTING 2 SLICES
		totalEachChild = totalAvailChildren / numChildren; //DIVIDE THE TOTAL OF SLICES AVAIL 4 CHILDREN WITH THE #OF CHILDREN
		leftOvers = totalAvailChildren % numChildren; //MOD THE TOTAL OF SLICES AVAIL 4 CHILDREN WITH THE #OF CHILDREN
	
//DISPLAY REQUIRED OUTPUTS
		System.out.println("Total number of slices of pizza: " + totalSlices); 
		System.out.println("Total number of slices given to adults: " + totalGivenAdults);
		System.out.println("Total number of slices available for children: " + totalAvailChildren);
		System.out.println("Total number of slices each child will get: " + totalEachChild);
		System.out.println("Total number of slices left over: " + leftOvers);
		
		}

}
