package beans;

public class TableBean {
	private int remainingPairs;
	private int pairsSelf, pairsOponent;
	private int triesSelf, triesOponent;

	public TableBean() {
		remainingPairs = 0xDEAD;
	}

	public int getRemainingPairs() {
		return remainingPairs;
	}

	public void setRemainingPairs(int pairs) {
		remainingPairs = pairs;
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
