package memory;

import java.lang.String;

public class MemoryBoardTest {
	public static void main(String[] args) {
		MemoryBoard<String> board = new MemoryBoard<String>();

		board.addPair(makeImageTag("at", "Österreich"));
		board.addPair(makeImageTag("cz", "Tschechien"));

		board.start();
	
		System.out.println(board);

		board.tryCard(0);
		
		System.out.println(board);

		board.tryCard(1);

		System.out.println(board);

		board.nextTurn();

		System.out.println(board);
	}

	public static String makeImageTag(String countryCode, String countryName) {
		return String.format("<img src=\"img/cards/%s.jpg\" alt=\"%s\" />", countryCode, countryName);
	}
}
