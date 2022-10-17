/**
 * SER-515 Reminder Visitor class responsible for implementing visitor pattern
 * @author keerthi pendyala, kpendya1@asu.edu
 * @version 1.0
 */
public class ReminderVisitor extends NodeVisitor {
	String m_Reminder;

	@Override
	public void visitFAcade(PtbsFacade HF) {
		System.out.println("visiting Facade ....");

	}

	@Override
	public Reminder visitTrading(Trading A) {
		System.out.println("visiting Trading ....");
		return A;
	}

	@Override
	public Reminder visitProduct(ProductList CL) {
		System.out.println("visiting Product ....");
		return CL;

	}

}