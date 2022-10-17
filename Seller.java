/**
 * SER-515 Seller class to inherit person class
 * @author keerthi pendyala, kpendya1@asu.edu
 * @version 1.0
 */
public class Seller extends Person {
	Seller() {
		super(theProductMenu);
	}

	Seller(ProductMenu theProductMenu) {
		super(theProductMenu);
	}

	@Override
	public void ShowMenu() {
		System.out.println("Seller Menu items....");

	}

	@Override
	public ProductMenu CreateProductMenu() {
		String test = "Meat";
		if (test.equalsIgnoreCase("Meat")) {
			return new MeatProductMenu();
		} else {
			return new ProduceProductMenu();
		}
	}

}