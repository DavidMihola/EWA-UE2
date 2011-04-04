package memory;

public class MemoryBoardTest {
	public static void main(String[] args) {
		MemoryBoard board = new MemoryBoard();

		board.addPair("1");
		board.addPair("2");

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
