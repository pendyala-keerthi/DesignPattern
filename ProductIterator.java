import java.util.Iterator;

/**
 * SER-515 Product Iterator to implement iterator pattern 
 * @author keerthi pendyala, kpendya1@asu.edu
 * @version 1.0
 */

public class ProductIterator extends ListIterator {
	@SuppressWarnings("rawtypes")
	public boolean HasNext(Iterator iterator) {
		return iterator.hasNext();
	}

	@SuppressWarnings("rawtypes")
	public void MoveToHead(Iterator iterator) {
		System.out.println("Head Moved..");
	}

	@SuppressWarnings("rawtypes")
	public String Next(Iterator iterator) {
		if (this.HasNext(iterator)) {
			return (String) iterator.next();
		} else {
			return null;
		}
	}

	@SuppressWarnings("rawtypes")
	public void Remove(Iterator iterator) {
		if (this.HasNext(iterator)) {
			iterator.next();
		}

	}

}