package servlets;

import beans.TableBean;
import memory.MemoryBoard;
import memory.MemoryBoardState;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletResponse;

import java.lang.Integer;

public class TableServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");

		HttpSession session = request.getSession(true);

		TableBean tableBean = (TableBean) session.getAttribute("tableBean");
		if (tableBean == null)
			tableBean = new TableBean();

		String karte = request.getParameter("karte");
		
		MemoryBoard board = tableBean.getBoard();

		if (board.gameOver()) {
			tableBean.reset();
		} else if (board.turnFinished()) {
			board.nextTurn();
		} else if (karte != null) {
			MemoryBoardState result = board.tryCard(Integer.parseInt(karte));

			if ((result == MemoryBoardState.PAIR_FOUND) || 
			    (result == MemoryBoardState.GAME_OVER)) {
				tableBean.incTriesSelf();
				tableBean.incPairsSelf();
			} else if (result == MemoryBoardState.NO_PAIR_FOUND) {
				tableBean.incTriesSelf();
			}			
		} 

		/*
		tableBean.setRemainingPairs(-14);
		tableBean.setPairsSelf(-1);
		tableBean.setPairsOponent(-2);
		tableBean.setTriesSelf(-3);
		tableBean.setTriesOponent(-4);
		*/

		session.setAttribute("tableBean", tableBean);

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/table.jsp");
		dispatcher.forward(request, response);
	}
}
