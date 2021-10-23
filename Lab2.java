/*-------------------------------------------------------------
// AUTHOR: MARIA GRIJALVA
// FILENAME: Lab2.java
// SPECIFICATION: A PROGRAM THAT ASKS THE USER TO ENTER THEIR FIRST AND LAST NAME.
// FOR: CSE 110 - Lab #2
// TIME SPENT: 1 1/2 HOURS
//--------------------------------------------------------------*/

import java.util.Scanner;

    public class Lab2 {
   	 public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

//Declare variables    
    String firstName, lastName, fullName;
    int nameLenght;

//String Input for first name
    System.out.print("Please enter first name: ");
    firstName = in.nextLine();
    
//String Input for last name
    System.out.print("Please enter last name: ");
    lastName = in.nextLine();
    
//Adds first to last name to create upper case
    fullName = (firstName + " " + lastName).toUpperCase();
    
//Finds the lenght of the fullname and stores it
    nameLenght = fullName.length();
     
//Display full name in upper case
    System.out.println("Full name (in capitals): " + fullName);
    
//Display full name length
    System.out.println("Length of full name: " + nameLenght);
    
//Define two String variables, title1 and title2 using
//String constructor to initialize them
    String title1 = new String ("cse110");
    String title2 = "cse110";
    
    if ( title1 == title2) {
    System.out.println("String comparison using \"==\" sign works");
    } else {
    System.out.println("String comparison using \"==\" sign does NOT work");
    }
    if ( title1.equals(title2)) {
    System.out.println("String comparison using \"equals\" method works");
    } else {
    System.out.println("String comparison using \"equals\" method does NOT work");
    } 
    
  in.close();
    
}
    }
