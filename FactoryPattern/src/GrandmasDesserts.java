/***
 * 
 * CPSC 60000
 * Programming Assignment #1 - Decorators
 * @author Evan Sabado
 *
 */

public class GrandmasDesserts {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Grandma's Desserts" + '\n' 
						+ "Earn Grandma Points (GP) with each purchase!" + '\n'
						+ "Redeem 50 GP for a Stroopwafel and a couple scoops of icecream" +'\n');
		
		double GPtotal = 0;
		
		// First Dessert
		Dessert dessert = new ChocolateChipCookie();
		dessert = new VanillaScoop(dessert);
		dessert = new ChocolateScoop(dessert);
		GPtotal += dessert.GrandmaPoints();
		System.out.println(dessert.getDescription() + " $" + dessert.cost()
							+ "| GP Earned: " + dessert.GrandmaPoints());

		// Second Dessert
		Dessert dessert2 = new YellowCake();
		dessert2 = new VanillaScoop(dessert2);
		dessert2 = new Sprinkles(dessert2);
		GPtotal += dessert2.GrandmaPoints();
		System.out.println(dessert2.getDescription() + " $" + dessert2.cost()
							+ "| GP Earned: " + dessert2.GrandmaPoints());
		
		// Third Dessert
		Dessert dessert3 = new Sundae();
		dessert3 = new Stroopwafel(dessert3);
		dessert3 = new Stroopwafel(dessert3);
		dessert3 = new Sprinkles(dessert3);
		dessert3 = new CarmelDrizzle(dessert3);
		GPtotal += dessert3.GrandmaPoints();
		System.out.println(dessert3.getDescription() + " $" + dessert3.cost()
							+ "| GP Earned: " + dessert3.GrandmaPoints());
		
		// Prints total Grandma Points earned for this order
		System.out.println('\n'+ "Total GP Earned: " + GPtotal);
	}

}
