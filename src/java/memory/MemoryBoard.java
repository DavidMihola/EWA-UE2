package memory;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.StringBuilder;

public class MemoryBoard {

	private ArrayList<Card> cards;

	private boolean started;

	public MemoryBoard() {
		cards = new ArrayList<Card>();
		started = false;
	}

	public void addPair(String content) {
		if (!started) {
			cards.add(new Card(content));
			cards.add(new Card(content));
		}
	}

	public void start() {
		Collections.shuffle(cards);
		started = true;
	}

	class Card {
		private String content;
		private boolean revealed;

		public Card(String content) {
			this.content = content;
			revealed = false;
		}
		
		public boolean isRevealed() {
			return revealed;
		}

		public void reveal() {
			revealed = true;
		}

		public void hide() {
			revealed = false;
		}

		public String toString() {
			return content;
		}
	}

	// toString = (concat . map show) cards

	public String toString() {
		StringBuilder output = new StringBuilder();

		int len = cards.size();

		for (int i = 0; i < len; i++) {
			Card card = cards.get(i);
			output.append("Card Nr. " + i);
			if (card.isRevealed()) {
				output.append(" shows " + card);
			} else {
				output.append(" is hidden");
			}
			output.append("\n");
		}

		return output.toString();
	}
}
