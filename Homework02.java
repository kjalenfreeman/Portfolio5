//Kandice Jalen Freeman
import java.util.Scanner;
public class Homework02 {

	public static void main(String[] args) {
		//Creating Scanner Key
		Scanner key = new Scanner(System.in);
		
		//Setting default values for boolean comparison
		boolean charm = false;
		boolean watch = false;
		
		//Setting an output for invalid options, such as misspelling or entering different words
		String ending = "Invalid response. Try checking your spelling and try again!";
		
		//Setting the nine endings
		String ending1 = "The chest is fully of gold! However, it has placed an lifelong curse on you.";
		String ending2 = "You stand in the basement too long. The walls start closing in and you have no choice but to run out of the mansion.";
		String ending3 = "The tunnel leads you back outside. You escape empty-handed.";
		String ending4 = "The walls begin to rumble and shake. You try to escape but it's too late. You buried under the rumble.";
		String ending5 = "Oh no. That wasn't right and the ghost did not like that. You did not escape.";
		String ending6 = "You are creeped out and decide to leave. You make it out safely.";
		String ending7 = "You escaped safely with a special token! Great job!";
		String ending8 = "Congratulations! The child leads you to a safe exit and wishs you luck! You escape safely with a special token!";
		String ending9 = "Wrong word. The word was \"please\". The child screams loudly and you do not make it out...";
		
		//Beginning of the story
		System.out.println("You see a strange-looking mansion on a nice fall evening. Of course, you decide to check it out. \n"
				+ "You walked in and the door slams behind you. There are 2 doors ahead, the basement and the attic. Enter \"basement\" or \"attic\".");
		String response = key.next();
		
		//User chooses to enter the basement
		if(response.equalsIgnoreCase("basement"))
		{
			System.out.println("You have entered the basement. It's chilly with lots of cobwebs. There is a creepy door that you can open or you can keep exploring. Enter \"door\" or \"explore\".");
			response = key.next();
			if(response.equalsIgnoreCase("door"))
			{
				System.out.println("You have discovered a shiny chest. Do you want to open the chest or leave it? Enter \"open\" or \"leave\".");
				response = key.next();
				if(response.equalsIgnoreCase("open"))
				{
					ending = ending1;
				}
				if(response.equalsIgnoreCase("leave"))
				{
					ending = ending2;
				}
			}
			if(response.equalsIgnoreCase("explore"))
			{
				System.out.println("You chose to explore. As you keep going, the basement seems to get longer and longer. You can explore the tunnel or stay where you are. Enter \"tunnel\" or \"stay\".");
				response = key.next();
				if(response.equalsIgnoreCase("tunnel"))
				{
					ending = ending3;
				}
				if(response.equalsIgnoreCase("stay"))
				{
					ending = ending4;
				}
			}
		}
		//User chooses to enter the attic
		else if(response.equalsIgnoreCase("attic"))
		{
			System.out.println("You have entered the attic. It's hot and humid. You can head toward some fog in the corner and a mirror. Enter \"fog\" or \"mirror\".");
			response = key.next();
			
			if(response.equalsIgnoreCase("fog"))
			{
				System.out.println("You walk towards the fog and it turns out to be a ghost.The ghost asks you, \"What is 9 times 8?\" Enter your answer: ");
				int intresponse = key.nextInt();
				//Numeric Comparison
				if(intresponse == 72)
				{
					System.out.println("Great job! You have earned a lucky charm!");
					charm = true;
					
				}
				else 
				{
					ending = ending5;				
				}	
			}
			else if(response.equalsIgnoreCase("mirror"))
			{
				System.out.println("Your reflection takes a mind of its own and tells you to leave immediately. What do you do? Enter \"obey\" or \"continue\".");
				response = key.next();
				
				if(response.equalsIgnoreCase("obey"))
				{
					ending = ending6;
				}
				else if(response.equalsIgnoreCase("continue"))
				{
					System.out.println("Risky! You have earned a ancient watch!");
					watch = true;
					//Broken
				}
			}
		
		//Boolean Comparison
		//If charm or watch is true (User has collected either through story), user is lead to 3 different potential endings.
		if(charm || watch)
		{
			System.out.println("You have collected a rare token. You are able to leave the attic and find yourself in the living room.\n"
					+ "To your left is the door to the outside and to your right looks like a bedroom door. Enter \"outside\" or \"bedroom\".");
			response = key.next();
			if(response.equalsIgnoreCase("outside"))
			{
				ending = ending7;
			}
			else if(response.equalsIgnoreCase("bedroom"))
			{
				System.out.println("You encounter a small child. She has a riddle for you,\n\"I’m a word that’s polite,\n"
						+ "Often used day or night.\n"
						+ "I follow a request,\n"
						+ "To show kindness is best.\n"
						+ "What am I?\" \nEnter the magic word: ");
				response = key.next();
				//String Comparison
				if(response.equalsIgnoreCase("please"))
				{
					ending = ending8;
				}
				else
				{
					ending = ending9;
				}
			}
		}
		}
		//Conclusion to story. Prints ending accordingly.
		System.out.println("Story over. Here is what happened: " + ending);
			
	}

}
