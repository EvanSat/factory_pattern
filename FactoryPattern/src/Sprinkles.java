
public class Sprinkles extends ToppingsDecorator {
	
	Dessert dessert;
	
	public Sprinkles(Dessert dessert) {
		this.dessert = dessert;
	}

	public String getDescription() {
		return dessert.getDescription() + ", Sprinkles";
	}
	
	public double cost() {
		return .25 + dessert.cost();
	}
	
	public double GrandmaPoints() {
		return .25 + dessert.GrandmaPoints();
	}
}
