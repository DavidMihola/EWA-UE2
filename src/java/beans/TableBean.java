package beans;

public class TableBean {
	private int remainingPairs;

	public TableBean() {
		remainingPairs = 0xDEAD;
	}

	public int getRemainingPairs() {
		return remainingPairs;
	}

	public void setRemainingPairs(int pairs) {
		remainingPairs = pairs;
	}
}
