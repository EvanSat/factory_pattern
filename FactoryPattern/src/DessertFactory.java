
public class DessertFactory {
	
	public static Dessert createDessert(String type) {
		Dessert dessert = null;
		
		if(type.equals("ApplePie")) {
			dessert = new ApplePie();
		} else if (type.equals("ChocolateChipCookie")) {
			dessert = new ChocolateChipCookie();
		} else if (type.equals("ChocolateMountain")) {
			dessert = new ChocolateMountain();
		} else if (type.equals("Sundae")) {
			dessert = new Sundae();
		} else if (type.equals("VanillaMountain")) {
			dessert = new VanillaMountain();
		} else if (type.equals("YellowCake")) {
			dessert = new YellowCake();
		}
		
		return dessert;
	}
	
}
