/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card test = new Card("Ace","Hearts",10);
		Card test1 = new Card("Ace","Spades",9);
		Card test2 = new Card("Jack","Clubs",10);
		System.out.println(test);
		System.out.println(test.matches(test1));
	}
}
