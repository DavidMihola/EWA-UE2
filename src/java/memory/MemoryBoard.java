package memory;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.StringBuilder;

// Ein MemoryBoard verwaltet eine Menge von Kartenpaaren:
// - vor dem Spiel fügt man Kartenpaare hinzu
// - durch wiederholte Aufrufe von tryCard kann man versuchsweise Karten aufdecken
// - wenn man zwei gleiche Karten aufdeckt, bleibe diese danach aufgedeckt
// - wenn man zwei verschiede Karten aufdeckt, werden diese zu Beginn des nächsten Zuges
//   wieder umgedreht (nextTurn())

// Das MemoryBoard interessiert sich allerdings nicht für Spieler oder deren Punktestände.
// Um diese zu verwalten wird eine weitere Klasse MemoryGame notwendig sein.
public class MemoryBoard<T>{

	private ArrayList<MemoryCard<T>> cards;

	private boolean started;

	private MemoryCard trial1, trial2;
	
	private MemoryBoardState state;
	
	private int remainingPairs; 

	public MemoryBoard() {
		cards = new ArrayList<MemoryCard<T>>();
		started = false;
		remainingPairs = 0;
	}

	public void addPair(T content) {
		if (!started) {
			cards.add(new MemoryCard<T>(content));
			cards.add(new MemoryCard<T>(content));
			remainingPairs += 1;
		}
	}

	public void start() {
		if (!started) {
			Collections.shuffle(cards);
			started = true;
			nextTurn();
		}	
	}

	public MemoryBoardState tryCard(int index) {
		// Wenn die aufgedeckte Karte in diesem Zug in die erste ist,
		// muss sonst nichts gemacht werden.
		if (trial1 == null) {
			trial1 = cards.get(index);
			trial1.reveal();
			state = MemoryBoardState.UNFINISHED_TURN;
		// Wenn die aufgedeckte Karte schon die zweite ist, müssen die
		// beiden Karten verglichen werden
		} else if (trial2 == null) {
			trial2 = cards.get(index);
			trial2.reveal();
			if (trial1.getContent() == trial2.getContent()) {
				state = MemoryBoardState.PAIR_FOUND;
				remainingPairs -= 1;
			} else {
				state = MemoryBoardState.NO_PAIR_FOUND;
			}
		}
		return state;
	}

	public void nextTurn() {
		if (state == MemoryBoardState.NO_PAIR_FOUND) {
			trial1.hide();
			trial2.hide();
		}
		trial1 = null;
		trial2 = null;
		state = MemoryBoardState.NEW_TURN;
	}

	public int getRemainingPairs() {
		return remainingPairs;
	}

	// toString = (concat . map show) cards

	public ArrayList<MemoryCard<T>> getCards() {
		return cards;
	}

	public String toString() {
		StringBuilder output = new StringBuilder();

		int len = cards.size();

		for (int i = 0; i < len; i++) {
			MemoryCard card = cards.get(i);
			output.append("Card Nr. " + i);
			if (card.isRevealed()) {
				output.append(" shows " + card);
			} else {
				output.append(" is hidden");
			}
			output.append("\n");
		}
		output.append("Board state is: " + state + "\n");

		return output.toString();
	}


}
