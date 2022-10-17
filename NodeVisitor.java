/**
 * SER-515 
 * Node Visitor class for Visitor pattern
 * @author keerthi pendyala, kpendya1@asu.edu
 * @version 1.0
 */
public abstract class NodeVisitor {

	public abstract void visitFAcade(PtbsFacade HF);

	public abstract Reminder visitTrading(Trading A);

	public abstract Reminder visitProduct(ProductList CL);

}