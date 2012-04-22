package test;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test3")
public class Test3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}
	
	/**
	 * @memo The Test URL
	 * http://localhost/test3?name=JavaRoad&hobby=succer&hobby=baseball
	 * */
	private void doProc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// use parameter by script let
		RequestDispatcher dispathcer = request.getRequestDispatcher( "test3.jsp" );
		dispathcer.forward( request, response );
	}
}
