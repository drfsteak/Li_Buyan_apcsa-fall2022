/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "ace"};
		String[] suits = {"spades", "hearts", "diamonds", "clubs"};
		int[] pointValues = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
		Deck test = new Deck(ranks, suits, pointValues);
		System.out.println(test);
		
	}
}
