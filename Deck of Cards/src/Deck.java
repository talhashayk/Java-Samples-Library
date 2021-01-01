import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	static String[] suit = { "Spades", "Hearts", "Clubs", "Diamonds" };
	static String[] rank = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	List<String> deck = new ArrayList<String>();

	public static void main(String[] args) {

		Deck d = new Deck();
		d.createDeck();
		d.shuffleDeck();
		System.out.println(d.dealHand(7));
	}

	public void createDeck() {
		for (int s = 0; s < 4; s++) {
			for (int r = 0; r < 13; r++) {
				deck.add(rank[r] + " of " + suit[s]);
			}
		}
	}

	public void shuffleDeck() {
		Collections.shuffle(deck);
	}

	public List<String> dealHand(int n) {
		int deckSize = deck.size();
		List<String> handView = deck.subList(deckSize-n, deckSize);
		List<String> hand = new ArrayList<String>(handView);
		handView.clear();
		return hand;
	}

	public void displayDeck() {
		for (String s : deck) {
			System.out.println(s);
		}
	}
}
