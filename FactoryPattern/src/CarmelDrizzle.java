
public class CarmelDrizzle extends ToppingsDecorator {
	
	Dessert dessert;
	
	public CarmelDrizzle(Dessert dessert) {
		this.dessert = dessert;
	}

	public String getDescription() {
		return dessert.getDescription() + ", Carmel Drizzle";
	}
	
	public double cost() {
		return .49 + dessert.cost();
	}
	
	public double GrandmaPoints() {
		return .5 + dessert.GrandmaPoints();
	}
}
