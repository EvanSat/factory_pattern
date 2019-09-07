/***
 * 
 * CPSC 60000
 * Programming Assignment #2 - Factory 
 * @author Evan Sabado
 *
 */

public class GrandmasDessertStore {
	
	public static void main(String[] arg) {
		Dessert dessert = DessertFactory.createDessert("ApplePie");
		dessert.cost();
		System.out.println(dessert.getDescription() + " $" + dessert.cost()
		+ "| GP Earned: " + dessert.GrandmaPoints());
		
		dessert = DessertFactory.createDessert("ChocolateMountain");
		dessert.cost();
		System.out.println(dessert.getDescription() + " $" + dessert.cost()
		+ "| GP Earned: " + dessert.GrandmaPoints());
	}
	
	
}
