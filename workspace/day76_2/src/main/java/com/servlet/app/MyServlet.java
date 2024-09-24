package com.servlet.app;

import java.io.IOException;
import java.io.PrintWriter;

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
		// TODO Auto-generated method stub
		//request 객체가 가지고 있는 데이터를 꺼내고 싶다면
		//getParameter()메소드를 사용한다
		//getParameter(String name) 메소드의 매개변수를 보면 name을 받게 된다
		//꺼내고 싶은 데이터의 이름을 넘겨주면 되고, 데이터의 이름은 html(jsp)에 작성한 태그의 name 속성값과 동일하다
//		String result = request.getParameter("userName");
//		System.out.println(result);
		response.setContentType("text/html; charset=UTF-8");
		String name = request.getParameter("userName");		
		PrintWriter out = response.getWriter();
		out.print("<h1>" + name + "</h1>");
		out.close();
 	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
