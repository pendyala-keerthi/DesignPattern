/**
 * SER-515 Trading class responsible for implementing visitor pattern
 * @author keerthi pendyala, kpendya1@asu.edu
 * @version 1.0
 */

public class Trading extends Reminder {

	public Reminder accept(NodeVisitor nodeVisitor) {
		System.out.println("Trading Reminder ...");
		return nodeVisitor.visitTrading(this);
	}
}
