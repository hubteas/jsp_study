package com.servlet.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
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
//		String result = request.getParameter("userName");
//		System.out.println(result);
//		response.setContentType("text/html; charset=UTF-8");
//		PrintWriter out = response.getWriter();
//		out.print("<h1>"+request.getParameter("userName")+"님 환영합니다."+"</h1>");
//		out.close();
//		getRequestDispatcher("경로").forward(request, response);
//		다른 서블릿이나 jsp로 요청을 전달한다
//		주로 클라이언트의 요청을 받아 다른 페이지로 이동시킬때 사용한다
//		getRequestDispatcher()는 request객체가 가지고 있으며 request객체를 전달할 파일 경로를 매개변수로 넘겨줘야한다
//		forward()에 request객체를 넘겨주므로 request가 가지고있는 데이터를 유지한체 jsp파일로 이동한다
		request.setAttribute("userName", request.getParameter("userName"));
		request.setAttribute("userAge", Integer.parseInt(request.getParameter("userAge"))+1);
		String userGender = request.getParameter("userGender");
		String gender = null;
		switch(userGender) {
		case "남자" :
			gender="남자";
			break;
		case "여자" :
			gender="여자";
			break;
		case "선택안함" :
			gender="선택안함";
			break;
		}
		request.setAttribute("userGender", gender);
		System.out.println(request.getParameterValues("interest"));
		String [] interestAr = request.getParameterValues("interest");
		System.out.println(Arrays.toString(interestAr));
		String interest = Arrays.toString(interestAr);
		request.setAttribute("interest", interest);
		request.getRequestDispatcher("/result.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
