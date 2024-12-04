//Kandice Jalen Freeman
import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		//asking for number of circles to sort
		int circleNum = 0;
		do {
		System.out.println("How many circles would you like to sort?");
		circleNum = key.nextInt();
		if (circleNum <= 0) {
            System.out.println("Invalid size. Please enter a positive integer.");
        }
		}while(circleNum <= 0);
		
		//creating an array of type double
		double[] circles = new double[circleNum];
		
		//storing user input for radii of circles
			for(int i = 0; i < circles.length; i++)
			{
					System.out.println("Enter the radius of the circle at index "+i+":");
					circles[i] = key.nextDouble();
			}
		//Calculating the area
			for(int i = 0; i < circles.length; i++)
			{
				double area = 0;
				area = 3.14 * circles[i]*circles[i];
				circles[i] = area;
			}
		
		//cannot sort an empty array
		if (circles.length == 0) {
			    System.out.println("Cannot sort an empty collection.");
			    return;
		}
		
		String option;
		do {	
		System.out.println("How would you like the areas displayed? Enter \"ascending\", \"descending\", \"unique\", or \"quit\".");
		option = key.next();
		if(option.equalsIgnoreCase("ascending")) {
			//Ascending order selection sort
			for(int i = 0; i < circles.length; i++)
			{
				int minIndex = i;
				double smallest = circles[i];
				
				for(int j = i+1; j < circles.length; j++)
				{
					if(circles[j] < smallest)
					{
						smallest = circles[j];
						minIndex = j;
					}
				}
				if(smallest < circles[i])
				{
					double temp = circles[i];
					circles[i] = circles[minIndex];
					circles[minIndex] = temp;
					
				}
			}
		// Printing contents in ascending order
	        System.out.println("Areas in ascending order:");
	        for (int i = 0; i < circles.length; i++) {
	            System.out.print(circles[i] + " \t");
	        }
	        
		}
		else if (option.equalsIgnoreCase("descending")) {
			//Descending order selection sort
			for(int i = 0; i < circles.length; i++)
			{
				int maxIndex = i;
				double largest = circles[i];
				
				for(int j = i+1; j < circles.length; j++)
				{
					if(circles[j] > largest)
					{
						largest = circles[j];
						maxIndex = j;
					}
				}
				if(largest > circles[i])
				{
					double temp = circles[i];
					circles[i] = circles[maxIndex];
					circles[maxIndex] = temp;
					
				}
			}
		// Printing contents in descending order
	        System.out.println("\nAreas in descending order:");
	        for (int i = 0; i < circles.length; i++) {
	            System.out.print(circles[i] + " \t");
	        }
		}
		else if(option.equalsIgnoreCase("unique")) {
			 // Printing unique values only
		       System.out.println("\nUnique values (Circles that do not duplicate):");
		       for(int i = 0; i < circles.length; i++)
		       {
		    	   int count = 0;
		    	   
		    	   for(int j = 0; j < circles.length; j++)
		    	   {
		    		   if(circles[i]==circles[j])
		    		   {
		    			   count++;
		    		   }
		    	   }
		    	   if(count == 1)
	    		   {
	    			   System.out.println(circles[i]);
	    		   }
		       }
		}
		else if(option.equalsIgnoreCase("quit")) {
		    System.exit(0);
		}
		else {
            System.out.println("Invalid option. Please try again.");
            
		}
		}while(!option.equalsIgnoreCase("quit")); //Allowing user to try again without quitting
	}
}
	  
