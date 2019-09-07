
public class Stroopwafel extends ToppingsDecorator {
	
	Dessert dessert;
	
	public Stroopwafel(Dessert dessert) {
		this.dessert = dessert;
	}

	public String getDescription() {
		return dessert.getDescription() + ", Stroopwafel";
	}
	
	public double cost() {
		return .99 + dessert.cost();
	}
	
	public double GrandmaPoints() {
		return 1 + dessert.GrandmaPoints();
	}
}
