package memory;

public class MemoryBoardTest {
	public static void main(String[] args) {
		MemoryBoard board = new MemoryBoard();

		board.addPair(new MemoryCard("1"));
		board.addPair(new MemoryCard("2"));

		board.start();
	
		System.out.println(board);

		board.tryCard(0);
		
		System.out.println(board);

		board.tryCard(1);

		System.out.println(board);

		board.nextTurn();

		System.out.println(board);
	}
}
