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
		initialize();
		start();
	}

	private void initialize() {
		pairsSelf = 0;
		pairsOponent = 0;
		triesSelf = 0;
		triesOponent = 0;
	}

	public void start() {
		board = new MemoryBoard<String>();

		board.addPair("<img src=\"img/cards/at.jpg\" alt=\"Österreich\" />");
		board.addPair("<img src=\"img/cards/cz.jpg\" alt=\"Tschechien\" />");
		board.addPair("<img src=\"img/cards/de.jpg\" alt=\"Deutschland\" />");
		board.addPair("<img src=\"img/cards/fr.jpg\" alt=\"Frankreich\" />");
		board.addPair("<img src=\"img/cards/it.jpg\" alt=\"Italien\" />");
		board.addPair("<img src=\"img/cards/skorea.jpg\" alt=\"Südkorea\" />");
		board.addPair("<img src=\"img/cards/tr.jpg\" alt=\"Türkei\" />");
		board.addPair("<img src=\"img/cards/usa.jpg\" alt=\"USA\" />");

		board.start();
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

	public void reset() {
		initialize();
		board.restart();
	}

	public MemoryBoard<String> getBoard() {
		return board;
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

	public void incPairsSelf() {
		pairsSelf ++;
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

	public void incTriesSelf() {
		triesSelf ++;
	}

	public int getTriesOponent() {
		return triesOponent;
	}

	public void setTriesOponent(int tries) {
		triesOponent = tries;
	}

	public String getBoardState() {
		return board.getState().toString();
	}
}
