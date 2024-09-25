package com.servlet.app;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("age", request.getParameter("age"));
		request.setAttribute("gender", request.getParameter("gender"));
		request.setAttribute("major1", request.getParameter("major1"));
		request.setAttribute("major2", request.getParameter("major2"));
		request.setAttribute("major3", request.getParameter("major3"));
		request.setAttribute("score1", Integer.parseInt(request.getParameter("score1")));
		request.setAttribute("score2", Integer.parseInt(request.getParameter("score2")));
		request.setAttribute("score3", Integer.parseInt(request.getParameter("score3")));

		
		request.getRequestDispatcher("/student.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
