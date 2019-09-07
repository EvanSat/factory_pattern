
public class VanillaScoop extends ToppingsDecorator {
	
	Dessert dessert;
	
	public VanillaScoop(Dessert dessert) {
		this.dessert = dessert;
	}

	public String getDescription() {
		return dessert.getDescription() + ", Vanilla Scoop";
	}
	
	public double cost() {
		return .99 + dessert.cost();
	}
	
	public double GrandmaPoints() {
		return 1 + dessert.GrandmaPoints();
	}
}
