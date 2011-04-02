package servlets;

import beans.TimerBean;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TimerServlet extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

            HttpSession session = request.getSession(true);
         
            TimerBean timerBean = (TimerBean) session.getAttribute("timerBean");
            if (timerBean == null){
                timerBean = new TimerBean();
                session.setAttribute("timerBean", timerBean);
            }else{

            }

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/timer.jsp");
            dispatcher.forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
