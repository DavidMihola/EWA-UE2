package beans;

import java.util.ArrayList;

import memory.MemoryBoard;
import memory.MemoryCard;
import memory.MemoryBoardState;

public class TableBean {
	private int remainingPairs;
	private int pairsSelf, pairsOponent;
	private int triesSelf, triesOponent;
	private MemoryBoard<String> board;

	public TableBean() {
		remainingPairs = 0xDEAD;
		pairsSelf = 0;
		pairsOponent = 0;
		triesSelf = 0;
		triesOponent = 0;

		start();
	}

	public void start() {
		board = new MemoryBoard<String>();

		board.addPair("<img src=\"img/cards/at.jpg\" alt=\"Österreich\" />");
		board.addPair("<img src=\"img/cards/cz.jpg\" alt=\"Tschechien\" />");

		board.start();

		//board.tryCard(0);
		//board.tryCard(2);
	}

	public ArrayList<String> getCardsAsXHTML() {
		ArrayList<String> output = new ArrayList<String>();
		ArrayList<MemoryCard<String>> cards = board.getCards();

		int i = 0;

		for (MemoryCard<String> card : cards) {
			if (card.isRevealed()) {
				output.add("<a>" + card.toString() + "</a>");
			} else {
				output.add("<a title=\"klicken um aufzudecken\" href=\"?karte="+i+"\"><span class=\"hidden\">Karte "+i+"</span></a>");
			}
			i ++;
		}

		return output;
	}

	public void tryCard(int cardNr) {
		MemoryBoardState state = board.tryCard(cardNr);
		switch(state) {
			case PAIR_FOUND:
				board.nextTurn();
				break;
			case NO_PAIR_FOUND:
				;
				break;
		}
	}

	public int getRemainingPairs() {
		return board.getRemainingPairs();
	}

	public void setRemainingPairs(int pairs) {
		// remainingPairs = pairs;
	}

	public int getPairsSelf() {
		return pairsSelf;
	}

	public void setPairsSelf(int pairs) {
		pairsSelf = pairs;
	}

	public int getPairsOponent() {
		return pairsOponent;
	}

	public void setPairsOponent(int pairs) {
		pairsOponent = pairs;
	}

	public int getTriesSelf() {
		return triesSelf;
	}

	public void setTriesSelf(int tries) {
		triesSelf = tries;
	}

	public int getTriesOponent() {
		return triesOponent;
	}

	public void setTriesOponent(int tries) {
		triesOponent = tries;
	}
}
