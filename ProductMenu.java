/**
 * SER-515 Login class implementing the implementation for productMenu using facade class
 * @author keerthi pendyala, kpendya1@asu.edu
 * @version 1.0
 */
public abstract class ProductMenu {

	public abstract void ShowAddButtons();

	public abstract void ShowViewButtons();

	public abstract void ShowRadios();

	public abstract void showComboxes();

	public abstract void ShowLabels();

	public abstract void selectProduct(int USerType);

	public void createProductList() {
		System.out.println("Product List created ...");
	}

	public void AttachProductToUser() {
		System.out.println("User Attached ... ");
	}

	public void productOperation() {
		System.out.println("Operation performed on the product...");
	}

}