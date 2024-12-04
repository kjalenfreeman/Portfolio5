//K. Jalen Freeman
import java.util.Scanner;

public class Homework01 {
	public static final int YEAR = 2024;
	
	public static void main(String[] args) {
		
		//Creating a new Scanner Key
		Scanner key = new Scanner(System.in);
		
		//Asking for and storing user input
		System.out.println("Enter your first name:");
		String firstname = key.nextLine();
		
		System.out.println("Enter your last name:");
		String lastname = key.nextLine();

		System.out.println("Enter your age (in years):");
		int age = key.nextInt();
		key.nextLine();
		
		System.out.println("Enter your phone number (without any dashes/parenthesis):");
		String phone = key.nextLine();
		
		System.out.println("Enter your major:");
		String major = key.nextLine();
		
		System.out.println("Enter your year (Freshman, Sophomore, Junior, Senior): ");
		String year = key.nextLine();
		
		System.out.println("Enter today's date (mm/dd/yyyy):");
		String todaydate = key.nextLine();
		
		System.out.println("What is your lucky number?");
		String luckynumber = key.nextLine();
		
		System.out.println("What is your favorite food?");
		String favfood = key.nextLine();
		
		System.out.println("What are you most excited about regarding college?");
		String excited = key.nextLine();
		
		//Computing birth year
		int birthyear = YEAR-age;
		
		//Converting the date dd.mm.yyyy
		String month = todaydate.substring(0,2);
		String day = todaydate.substring(3,5);
		String dateyear = todaydate.substring(6,10);
		String europeandate = day + "." + month + "." + dateyear;
		
		//Formatting the phone number (xxx)xxx-xxxx
		String area = phone.substring(0,3);
		String phone1 = phone.substring(3,6);
		String phone2 = phone.substring(6,10);
		String formattedphone = "("+area+")"+phone1+"-"+phone2;
		
		
		
		//Creating the intro paragraph
		System.out.println("Intro:\nHello! Meet " +firstname +" "+ lastname + 
				". They were born in " + birthyear + " and are majoring in " + major + 
				".\n Currently, they are a " + year + " who is most excited about " + excited + 
				".\n Their lucky number, " + luckynumber + ", always has their back. As of today, " + europeandate + 
				", their favorite food is " + favfood + ".\n Reach out to them by calling, " + 
				formattedphone + "! Go Cocks!"); 
	}

}
