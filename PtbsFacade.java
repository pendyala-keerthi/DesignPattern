import java.util.Iterator;
import java.util.Scanner;

/**
 * SER-515 Facade class to take care of the facade pattern it calls the classes
 * for bridge pattern, factory pattern, visitor pattern, iterator pattern
 * @author keerthi pendyala, kpendya1@asu.edu
 */

public class PtbsFacade {
	int UserType;
	String theSelecteProduct;
	int nProductLevel;
	int theProductList;
	int thePerson;

	public void startFacade() {
		System.out.println("Facade pattern initiated ");
		UserType = login(new Login());
		System.out.println(
				"Select from available Product Menus \n 1. Meat Product Menu \n 2. Produce Product Menu ");
		Scanner scan = new Scanner(System.in);
		theSelecteProduct = scan.nextLine();
		// pattern implemented (Bridge implementation and Factory implementation
		if (theSelecteProduct.equalsIgnoreCase("Meat Product Menu")) {
			selectProduct(new MeatProductMenu(), UserType);
		} else if (theSelecteProduct.equalsIgnoreCase("Produce Product Menu")) {
			selectProduct(new ProduceProductMenu(), UserType);
		} else {
			System.out.println("Wrong Selection");
			System.exit(-1);
		}
		System.out.println("Implementing Visitor Pattern....");
		remind();
		System.out.println("Implementing Iterator pattern ....");
		ProductList products = new ProductList();
		@SuppressWarnings("rawtypes")
		Iterator iterate = (Iterator) products.createIterator();
		ProductIterator ProductIterator = new ProductIterator();
		OfferingList offerList = new OfferingList();
		@SuppressWarnings("rawtypes")
		Iterator iterate2 = (Iterator) offerList.createIterator();
		OfferingIterator si = new OfferingIterator();
		while (ProductIterator.HasNext(iterate)) {
			System.out.println(ProductIterator.Next(iterate));
			System.out.println(si.Next(iterate2));
		}
		scan.close();
	}

	public int login(Login object) {
		return object.login();
	}

	public void AddTrading(TradingMenu TM) {
		TM.AddTrading();
	}

	public void ViewTrading(TradingMenu VM) {
		VM.ViewTrading();
	}

	public void viewOffering(OfferingMenu SM) {
		SM.viewOffering();
	}

	public void markOffering(OfferingMenu SM) {
		SM.markOffering();
	}

	public void submitOffering(OfferingMenu SM) {
		SM.submitOffering();
	}

	public void remind() {
		ReminderVisitor remind = new ReminderVisitor();
		ProductList CL = new ProductList();
		CL.accept(remind);

	}

	public void createUser(UserInfoItem userinfoitem) {
		userinfoitem.createUSer();
	}

	public void createProductList(ProductMenu CM) {
		CM.createProductList();
	}

	public void AttachProductToUser(ProductMenu CM) {
		CM.AttachProductToUser();

	}

	public void selectProduct(ProductMenu CM, int UserType) {
		CM.selectProduct(UserType);
	}

	public void productOperation(ProductMenu CM) {
		CM.productOperation();
	}

}