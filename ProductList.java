import java.util.ArrayList;
import java.util.Iterator;

/**
 * SER-515 Product List class to implement the iterator pattern 
 * @author keerthi pendyala, kpendya1@asu.edu
 * @version 1.0
 */
@SuppressWarnings("rawtypes")
public class ProductList extends Reminder {

	ArrayList<String> offer = new ArrayList<>();

	ProductList() {
		offer.add("Product Beef");
		offer.add("Product Pork");
        offer.add("Product Mutton");
		offer.add("Product Tomato");
        offer.add("Product Onion");
	}


	public Iterator createIterator() {
		return this.offer.iterator();
	}

	public Reminder accept(NodeVisitor nodeVisitor) {
		System.out.println("Product List Reminder ...");
		return nodeVisitor.visitProduct(this);
	}

}