package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.BookVo;
import vo.UserVo;

public class TestDB3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<BookVo> bookList;
	private List<UserVo> userList;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}
	
	private void doProc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		// make book list
		bookList = new ArrayList<BookVo>();
		userList = new ArrayList<UserVo>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root", "yamamori");
            stmt = con.createStatement();

            rs = stmt.executeQuery("SELECT * FROM book");
			while(rs.next()){
				BookVo bookVo = new BookVo();
				bookVo.setBookid(rs.getInt("bookid"));
				bookVo.setTitle(rs.getString("title"));
				bookVo.setUserid(rs.getInt("userid"));
				bookVo.setPrice(rs.getInt("price"));
				bookList.add(bookVo);
			}
			
			rs = stmt.executeQuery("SELECT * FROM user");
			while(rs.next()){
				UserVo userVo = new UserVo();
				userVo.setUserid(rs.getInt("userid"));
				userVo.setUsername(rs.getString("username"));
				userVo.setAge(rs.getInt("age"));
				userVo.setSex(rs.getString("sex"));
				userVo.setMoney(rs.getInt("money"));
				userList.add(userVo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
        } finally {
        	try {
        		rs.close();
        		stmt.close();
        		con.close();
        	} catch ( SQLException e ){
                e.printStackTrace();
            }
        }
        
        // setRequest
        request.setAttribute("bookList",bookList);
        request.setAttribute("userList",userList);
		
        // dispatch
		RequestDispatcher dispathcer = request.getRequestDispatcher( "testDB3.jsp" );
		dispathcer.forward( request, response );
		return;
	}
}
