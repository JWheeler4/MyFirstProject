
public class Application {
	
	public static void main(String[] args) {
		
		//create a variable to hold the quantity of available plane seats left on a flight
		int planeCapacity = 250;
		int planeSeatsFilled = 50;
		int planeSeatsLeft = planeCapacity - planeSeatsFilled;
		
		//create a variable to hold the cost of groceries at checkout
		double groceryCost = 12.34;
		
		//create a variable to hold a person's middle initial
		char midInitial = 'L';
		
		//create a variable to hold true if it's hot outside and false if it's cold outside
		int temp = 79;
		boolean isItHot = temp > 78;
		
		//create a variable to hold a customer's first name
		String customerFirstName = "Jonathan";
		
		//create a variable to hold a street address
		String streetAddress = "123 Fake St";
		
		//print all variables to console
		System.out.println("Available seats left on the plane: " + planeSeatsLeft);
		System.out.println("$" + groceryCost + " is the cost of the groceries.");
		System.out.println(midInitial + " is the person's middle initial.");
		System.out.println("It is " + isItHot + " that it is hot outside.");
		System.out.println("Customer's first name: " + customerFirstName);
		System.out.println("Street Address: " + streetAddress);
		
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		planeSeatsLeft = planeSeatsLeft - 2;
		System.out.println("Available seats left on the plane: " + planeSeatsLeft);
		
		//impulse candy bar purchase, add 2.15 to the grocery total
		groceryCost = groceryCost + 2.15;
		System.out.println("The new grocery total cost is $" + groceryCost);
		
		//birth certificate was printed incorrectly, change the middle initial to something else
		midInitial = 'J';
		System.out.println(midInitial + " is the person's middle initial.");
		
		//the season has changed, update the hot outside variable to be opposite of what it was
		temp = temp - 2;
		isItHot = temp > 78;
		System.out.println("It is " + isItHot + " that it is hot outside.");
		
		//create a new variable called full name using the customer's first name, the middle initial, and the last name of your choice
		String customerFullName = customerFirstName + " " + midInitial + " " + "Wheeler";
		System.out.println("The customer's full name is " + customerFullName);
		
		//print a line to the console that introduces the customer and says they live at the address variable
		System.out.println("Hello, my full name is " + customerFullName + " and I live at " + streetAddress + ".");
	}
	
}
