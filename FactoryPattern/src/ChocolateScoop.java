
public class ChocolateScoop extends ToppingsDecorator {
	
	Dessert dessert;
	
	public ChocolateScoop(Dessert dessert) {
		this.dessert = dessert;
	}

	public String getDescription() {
		return dessert.getDescription() + ", Chocolate Scoop";
	}
	
	public double cost() {
		return .99 + dessert.cost();
	}
	
	public double GrandmaPoints() {
		return 1 + dessert.GrandmaPoints();
	}
}