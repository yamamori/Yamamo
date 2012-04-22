package test;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestDB1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String testParam;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}
	
	private void doProc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		RequestDispatcher dispathcer = request.getRequestDispatcher( "testDB1.jsp" );
		dispathcer.forward( request, response );
		return;
	}

	public String getTestParam() {
		return testParam;
	}
}
