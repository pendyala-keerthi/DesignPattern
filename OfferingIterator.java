import java.util.Iterator;

/**
 * SER-515 OfferingIterator class for Visitor Pattern
 * @author keerthi pendyala, kpendya1@asu.edu
 * @version 1.0
 */
public class OfferingIterator extends ListIterator {
	@SuppressWarnings("rawtypes")
	@Override
	public boolean HasNext(Iterator iterator) {
		return iterator.hasNext();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void MoveToHead(Iterator iterator) {
		System.out.println("Head Moved ");
	}

	@SuppressWarnings("rawtypes")
	@Override
	public String Next(Iterator iterator) {
		if (this.HasNext(iterator)) {
			return (String) iterator.next();
		} else {
			return null;
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void Remove(Iterator iterator) {
		if (this.HasNext(iterator)) {
			iterator.next();
		}

	}

}