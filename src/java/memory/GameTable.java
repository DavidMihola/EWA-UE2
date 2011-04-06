package memory;

public class GameTable {

	private Player startPlayer;
	private Player lastPlayer;
	private Player currentPlayer;


	public GameTable() {
		
	}

	public void addPlayer(String name) {
		Player newPlayer = new Player(name);
		if (startPlayer == null) {
			startPlayer = newPlayer;
			startPlayer.setSuccessor(startPlayer);
			lastPlayer = newPlayer;
		} else {			
			lastPlayer.setSuccessor(newPlayer);
			newPlayer.setSuccessor(startPlayer);
			lastPlayer = newPlayer;
		}

	}

	public void start() {
		currentPlayer = startPlayer;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void nextPlayer() {
		currentPlayer = currentPlayer.getSuccessor();
	}

	private class Player {
		private int score;
		private String name;
		private Player successor;

		public Player (String name) {
			this.name = name;
		}

		public Player getSuccessor() {
			return successor;
		}

		public void setSuccessor(Player successor) {
			this.successor = successor;
		}

		public String toString() {
			return name;
		}
	}

}
