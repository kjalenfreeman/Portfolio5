//Kandice Jalen Freeman
public class Coffee {
	
	//instance variables
	private String coffee;
	private double caffeine;
	
	//default constructor
	public Coffee() 
	{
		this.coffee = "none";
		this.caffeine = 50;
	}
	
	//parameters
	public Coffee(String xCoffee, double xCaffeine) {
		this.setCoffee(xCoffee);
		this.setCaffeine(xCaffeine);
	}
	
	//accessors
	public String getCoffee() {
		return this.coffee;
	}
	public double getCaffeine() {
		return this.caffeine;
	}
	
	//mutators
	public void setCoffee(String xCoffee) {
		 this.coffee = xCoffee;
	}
	public void setCaffeine(double xCaffeine) {
		if(xCaffeine >= 50 && xCaffeine <= 300) {
			this.caffeine = xCaffeine;
		}
		else {
			System.out.println("Invalid Caffeine Amount!");
			System.exit(0);
		}
	}
	
	//risk calculator
	public String riskyAmt()
	{
		double risk = 180.0/((this.caffeine/100)*6.0);
		return "It would take " + risk + " cups of "+ this.coffee +" before it’s dangerous to drink more.";
		
	}
	
	//equals
	public boolean equals(Coffee c)
	{
		return c.getCoffee().equals(this.coffee)
				&& c.getCaffeine() == this.caffeine;
	}
	
	//toString
	public String toString()
	{
		return "Name: "+this.coffee
				+"\nCaffeine Amount: "+this.caffeine;
	}
	
}

