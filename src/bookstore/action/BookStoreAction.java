package bookstore.action;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bookstore.bo.BookStoreBo;
import bookstore.vo.BookVo;
import bookstore.vo.UserVo;

public class BookStoreAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}
	
	private void doProc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		
		String jspName = "";
		String proc = request.getParameter("proc");
		
		if(proc == null || proc.equals("") || proc.equals("show")){
			jspName = show(request);
		}else if(proc.equals("regist")){
			jspName = regist(request);
		}
        
        // dispatch
		RequestDispatcher dispathcer = request.getRequestDispatcher("bookstore/"+jspName+".jsp");
		dispathcer.forward( request, response );
		return;
	}

	private String show(HttpServletRequest request){
		BookStoreBo bo = new BookStoreBo();
		
		List<BookVo> bookList = bo.getBookList();
		List<UserVo> userList = bo.getUserList();
		
        // setRequest
        request.setAttribute("bookList",bookList);
        request.setAttribute("userList",userList);
        
        return "index";
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

	
}
