import java.util.ArrayList;
import java.util.Iterator;

/**
 * SER-515 OfferingList to store list of Offerings implementing the iterator pattern
 * @author keerthi pendyala, kpendya1@asu.edu
 * @version 1.0
 */
public class OfferingList {

	ArrayList<String> Offer = new ArrayList<>();

	OfferingList() {
		Offer.add("Offering for Beef");
		Offer.add("Offering for Pork");
        Offer.add("Offering for Mutton");
		Offer.add("Offering for tomato");
        Offer.add("Offering for Onion");
        // not sure need to verify whether this is correct or not
        
	}

	@SuppressWarnings("rawtypes")
	public Iterator createIterator() {
		return this.Offer.iterator();
	}
}