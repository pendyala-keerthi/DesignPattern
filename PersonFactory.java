/**
 * SER-515 
 * Person Factory class responsible for factory pattern and returning the desired objects 
 * @author keerthi pendyala, kpendya1@asu.edu
 */
public class PersonFactory extends Person {

	PersonFactory(ProductMenu theProductMenu) {
		super(theProductMenu);
	}

	@Override
	public void ShowMenu() {}

	@Override
	public ProductMenu CreateProductMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	public static Person createObject(String str) {
		Person person;
		System.out.println("Factory Pattern Intiated for user creation....");
		if (str.equalsIgnoreCase("Buyer")) {
			person = new Buyer();
		} else

		{
			person = new Seller();
		}
		return person;
	}
}