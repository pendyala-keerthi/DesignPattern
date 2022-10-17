/**
 * SER-515 Login class implementing the implementation for person using bridge class
 * @author keerthi pendyala, kpendya1@asu.edu
 * @version 1.0
 */
public abstract class Person {
	protected static ProductMenu theProductMenu;

	public abstract void ShowMenu();

	public abstract ProductMenu CreateProductMenu();

	@SuppressWarnings("static-access")
	Person(ProductMenu theProductMenu) {
		this.theProductMenu = theProductMenu;
	}

	public void ShowAddButtons() {
		theProductMenu.ShowAddButtons();
	}

	public void showViewButtons() {

		theProductMenu.ShowViewButtons();
	}

	public void showRadios() {
		theProductMenu.ShowRadios();
	}

	public void showCombos() {
		theProductMenu.showComboxes();
	}

	public void showLabels() {
		theProductMenu.ShowLabels();
	}
}