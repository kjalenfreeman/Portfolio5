//Kandice Jalen Freeman
import java.util.Scanner;
import java.util.Random;
public class Homework03 {
	
	public static void main(String[] args) {
		Scanner key = new Scanner (System.in);
		String response;
		
		Random r = new Random();
		
		//Setting the overall game scores
		int computerscore = 0;
		int humanscore = 0;

		
		do {
			
		//reseting scores
		computerscore = 0;
		humanscore = 0;
			
			for(int i = 0; i < 3; i++)
			{
				
				//Computer chooses random integer (computer's choice)
				int computerchoice = r.nextInt(3)+1; //random (1-3)
				String computerchoiceGesture = "";
				
				//Key to later print Gesture instead of number
				if(computerchoice == 1)
				{
					computerchoiceGesture = "rock";
				}
				else if(computerchoice == 2)
				{
					computerchoiceGesture = "paper";
				}
				else if(computerchoice == 3)
				{
					computerchoiceGesture = "scissors";
				}
				
				//Asking for user's choice
				System.out.println("Enter \"rock\", \"paper\" or \"scissors\".");
				String humanchoice = key.next();
				
				int humanchoiceNumber = 0;
				if(humanchoice.equalsIgnoreCase("rock"))
				{
					humanchoiceNumber = 1;
				}
				else if(humanchoice.equalsIgnoreCase("paper"))
				{
					humanchoiceNumber = 2;
				}
				else if(humanchoice.equalsIgnoreCase("scissors"))
				{
					humanchoiceNumber = 3;
				}
				else
				{
					System.out.println("Error! The computer gets the point!");
					computerscore++;
				}
				
				//Printing the computer's choice and results of the round
				System.out.println("The computer played " + computerchoiceGesture +".");
				if(humanchoiceNumber < computerchoice)
				{
					System.out.println("The computer has earned one point!");
					computerscore++;
				}
				else if(computerchoice < humanchoiceNumber)
				{
					System.out.println("You have earned a point!");
					humanscore++;
				}
				else if(humanchoiceNumber == computerchoice)
				{
					System.out.println("You and the computer have tied! No points issued.");
				}
				else 
				{
					System.out.println("Error!");
				}
			}
		
		//Printing the outcome of overall game
		if(humanscore < computerscore)
		{
			System.out.println("The computer has won the game!");
		}
		else if(humanscore > computerscore)
		{
			System.out.println("You have won the game!");
		}
		else if(humanscore == computerscore)
		{
			System.out.println("You and the computer are tied this game!");
		}
		else
		{
			System.out.println("Error!");
		}
		
		//Asking user if they would like to play again
		System.out.println("Would you like to play again? Enter \"yes\" or \"no\".");
		response = key.next();
		
		} while (response.equalsIgnoreCase("yes")); //if yes, repeat do-while loop
	
		System.exit(0); //otherwise, exit the program. 
	}
	

}
