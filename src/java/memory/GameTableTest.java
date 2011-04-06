package memory;

public class GameTableTest {
	public static void main(String[] args) {
		GameTable table = new GameTable();

		table.addPlayer("David");
		table.addPlayer("Sarah");
		table.addPlayer("Victor");
		table.addPlayer("Zoé");

		table.start();

		for (int i = 0; i < 10; i++) {
			System.out.println(table.getCurrentPlayer());

			table.nextPlayer();
		}
	}
}
