package test;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test3")
public class Test5 extends HttpServlet {
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
		
		// 1. もらう
		String strNum = request.getParameter("num");
		request.getParameter("param");
		request.getParameter("key1");
		
		// 2. データ加工
		// 2-1. validation
		int num = 0;
		if(strNum != null){
			num= Integer.parseInt(strNum);
		}
		num += 1;

		// 表示用のデータを用意
		testParam = "It's the test-message222.";
		request.setAttribute("testParamVal",testParam);
		request.setAttribute("testNum",String.valueOf(num));
		request.setAttribute("yama", "hara hetta");
		
		// dispathcer
		RequestDispatcher dispathcer = request.getRequestDispatcher( "test5.jsp" );
		dispathcer.forward( request, response );
	}
}
