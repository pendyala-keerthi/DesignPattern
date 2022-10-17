/**
 * SER-515 Hacs main class to initiate the facade pattern
 * @author keerthi pendyala, kpendya1@asu.edu
 * @version 1.0
 */
public class PTBSMain {

	public static void main(String[] args) {
		// Facade Pattern called
		PtbsFacade object = new PtbsFacade();
		object.startFacade();

	}

}