package test;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test3")
public class Test4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String testParam;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}
	
	/**
	 * @memo The Test URL
	 * http://localhost/test?name=JavaRoad&hobby=succer&hobby=baseball
	 * */
	private void doProc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// use EL
		testParam = "It's the test-message.";
		request.setAttribute("testParamVal",testParam);
		RequestDispatcher dispathcer = request.getRequestDispatcher( "test4.jsp" );
		dispathcer.forward( request, response );
	}
}
