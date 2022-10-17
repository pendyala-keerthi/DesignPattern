/**
 * SER-515 Meat Product responsible for bridge patterna and factory pattern
 * @author keerthi pendyala, kpendya1@asu.edu
 * @version 1.0
 */
public class MeatProductMenu extends ProductMenu {

	@Override
	public void ShowAddButtons() {
		System.out.println();

	}

	@Override
	public void ShowViewButtons() {

		System.out.println();
	}

	@Override
	public void ShowRadios() {

		System.out.println();
	}

	@Override
	public void showComboxes() {

		System.out.println();
	}

	@Override
	public void ShowLabels() {

		System.out.println();
	}

	public void selectProduct(int USerType) {
		System.out.println("Meat Product Selected ...\n Bridge Pattern for connection used");
		Person person;
		if (USerType == 0) {
			person = PersonFactory.createObject("Buyer");

		} else
		{
			person = PersonFactory.createObject("Seller");

		}
		person.ShowMenu();
	}

}