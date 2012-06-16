package bookstore.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bookstore.bo.BookStoreBo;
import bookstore.vo.BookVo;
import bookstore.vo.UserVo;

public class BookStoreApi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}
	
	private void doProc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		
		String proc = request.getParameter("proc");
		String result = "";
		
		if(proc.equals("regist")){
			result = regist(request);
		}else if(proc.equals("delete")){
			result = delete(request);
		}
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(result);
		out.close();
		return;
	}
	
	private String regist(HttpServletRequest request){
		BookStoreBo bo = new BookStoreBo();
		
		String title = request.getParameter("title");
		String userId = request.getParameter("userid");
		String strPrice = request.getParameter("price");
		int price = Integer.parseInt(strPrice);
		bo.registNewBook(title, userId, price);
		
		return "success";
	}
	
	private String delete(HttpServletRequest request){
		BookStoreBo bo = new BookStoreBo();
		
		String strBookid = request.getParameter("bookid");
		int bookId = Integer.parseInt(strBookid);
		bo.deleteBook(bookId);
		
		return "success";
	}
}
