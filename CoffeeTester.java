//Kandice Jalen Freeman
import java.util.Scanner;
public class CoffeeTester {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in); 
		
		//create an object of type Coffee
			Coffee c1 = new Coffee();
			Coffee c2 = new Coffee();
				
		System.out.println("Welcome to Coffee Hour!");
		
		System.out.println("What’s the name of the first coffee?");
		String xCoffee = key.nextLine();
		
		System.out.println("What’s the caffeine content?");
		double xCaffeine = key.nextDouble();
		
		//Change values
		 c1.setCoffee(xCoffee);
	     c1.setCaffeine(xCaffeine);
	     
	    //Print result 
	     System.out.println(c1.toString());
	     System.out.println(c1.riskyAmt());

	    System.out.println("What’s the name of the second coffee?");
	    key.nextLine();
	    String xCoffee2 = key.nextLine();
		
	    System.out.println("What’s the caffeine content?");
        double xCaffeine2 = key.nextDouble();
	    
		//Change values
		 c2.setCoffee(xCoffee2);
		 c2.setCaffeine(xCaffeine2);
	     
		//Print result 
	     System.out.println(c2.toString());
	     System.out.println(c2.riskyAmt());
	     
	     //equals
	     System.out.println("Are both coffee's the same? "+ c1.equals(c2));
	     
	     //Continue?
	     System.out.println("Do you want to create more coffee objects? Enter “Yes” or “No”:");
		String response = key.next();
		
	     if(response.equalsIgnoreCase("yes")){
	 		Coffee c3 = new Coffee();
	    	System.out.println("What’s the name of the third coffee?");
	 	    key.nextLine();
	 	    String xCoffee3 = key.nextLine();
	 		
	 	    System.out.println("What’s the caffeine content?");
	         double xCaffeine3 = key.nextDouble();
	 	    
	 		//Change values
	 		 c3.setCoffee(xCoffee3);
	 		 c3.setCaffeine(xCaffeine3);
	 	     
	 		//Print result 
	 	     System.out.println(c3.toString());
	 	     System.out.println(c3.riskyAmt());
	 	     
	 	     //equals
	 	     System.out.println("Are both coffee's the same? "+ c2.equals(c3));
	     }
	     else if(response.equalsIgnoreCase("no")) {
	    	 System.exit(0);
	     }
	     else {
	    	 System.out.println("Invalid Input!");
	     }
	}

}
