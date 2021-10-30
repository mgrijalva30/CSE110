/*-----------------------------------------------------------------------------------
 * CSE 110: Class #75641 / Online
 * Assignment: Assignment 02
 * Author: Maria Grijalva / ID# 1224167256
 * Description: This program computes the materials and costs for a road construction
 * 				project.
 ------------------------------------------------------------------------------------*/

import java.util.Scanner;
	public class Assignment02 {
		public static void main(String[] args) {

	//User Input
	double lenghtRoadMiles = 0.0;
	int numLanes = 0;
	int depthAsphalt = 0;
	int completeProj = 0;
	
	//Output for amount of materials needed
	double truckAsphalt = 0; //Round up
	int stoplights = 0;
	int numIntersections = 0;
	double conduitPipes = 0; //Round up
	double crewMembers = 0; //Round up
	//Output for cost of material
	double costAsphalt = 0;
	double costStoplight = 0;
	double costConduitPipes = 0;
	double costLabor = 0;
	//Output for total cost of project
	double totalCost = 0;
	
			Scanner in = new Scanner(System.in);
			
	//Prompt to collect inputs
	System.out.print("Lenght of road project (miles): ");
		lenghtRoadMiles = in.nextDouble();
	System.out.print("Number of lanes: ");
		numLanes = in.nextInt();
	System.out.print("Depth of asphalt (inches): ");
		depthAsphalt = in.nextInt();
	System.out.print("Days to complete project: ");
		completeProj = in.nextInt();
	
	//Compute required values for the amount of materials needed
	truckAsphalt = Math.ceil((numLanes * depthAsphalt * lenghtRoadMiles * 9504000) / 120000);
	numIntersections = (int)lenghtRoadMiles;
	stoplights = numIntersections * (2 + numLanes);
	conduitPipes = Math.ceil((lenghtRoadMiles * 5280) / 24);
	crewMembers = Math.ceil((50 * lenghtRoadMiles * numLanes) / completeProj);
	//Compute required values for cost of material
	costAsphalt = truckAsphalt * 1000;
	costStoplight = stoplights * 25000;
	costConduitPipes = conduitPipes * 500;
	costLabor = crewMembers * 25 * 8 * completeProj;
	//Compute for total cost of project 
	totalCost = costAsphalt + costStoplight + costConduitPipes + costLabor;
	
	//Prints out the amount of materials needed and cost
	System.out.println("===== Amount of materials needed =====");
	System.out.println("Truckloads of Aphalt: " + (int)truckAsphalt);
	System.out.println("Stoplights: " + stoplights);
	System.out.println("Conduit pipes: " + (int)conduitPipes);
	System.out.println("Crew members needed: " + (int)crewMembers);
	System.out.println("===== Cost of Materials =====");
	System.out.printf("Cost of Asphalt: $%.2f\n", costAsphalt);
	System.out.printf("Cost of Stoplights: $%.2f\n", costStoplight);
	System.out.printf("Cost of Conduit Pipes: $%.2f\n", costConduitPipes);
	System.out.printf("Cost of Labor: $%.2f\n", costLabor);
	System.out.println("====== Total Cost of Project ======");
	System.out.printf("Total cost of project: $%.2f\n", totalCost);
	
in.close();		
				}
		
			}	
