package com.servlet.output;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OutputServlet
 */
@WebServlet("/output")
public class OutputServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OutputServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html; charset=UTF-8");
      
      //request는 사용자가 입력한 폼 데이터를 가지고 있다
      //폼 데이터를 꺼내는 방법은 getParameter(데이터 이름)을 사용하면 된다
      //데이터 이름은 input 태그의 name속성에 입력한 값과 동일하게 작성할 때 문자열로 작성한다
      //반환타입은 문자열이다
      String name = request.getParameter("name");
      int age = Integer.parseInt(request.getParameter("age"));
      
      PrintWriter out = response.getWriter();
      out.println("<html>");
      out.println("<head>");
      out.println("<title>output</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>결과 출력</h1>");
      out.println("<p>이름 : " + name + "</p>");
      out.println("<p>나이 : " + age + "</p>");
      out.println("<p>2024년 나이 : " + age + ", 2025년 나이 : " + (age + 1) + "</p>");
      out.println("</body>");
      out.println("</html>");
      
      
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doGet(request, response);
   }

}

