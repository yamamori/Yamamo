package bookstore.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bookstore.vo.BookVo;
import bookstore.vo.UserVo;

public class BookStoreDao {
	
	private Connection con = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	
	private void connect() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root", "yamamori");
        stmt = con.createStatement();
	}
	private void closeConnect(){
    	try {
    		if(rs != null){
    			rs.close();
    		}
    		stmt.close();
    		con.close();
    	} catch ( SQLException e ){
            e.printStackTrace();
        }
	}
	
	/**
	 * 本一覧の取得
	 * */
	public List<BookVo> selectBookList(){
		List<BookVo> bookList = new ArrayList<BookVo>();
		try {
			this.connect();
			
            rs = stmt.executeQuery("SELECT * FROM book");
			while(rs.next()){
				BookVo bookVo = new BookVo();
				bookVo.setBookid(rs.getInt("bookid"));
				bookVo.setTitle(rs.getString("title"));
				bookVo.setUserid(rs.getString("userid"));
				bookVo.setPrice(rs.getInt("price"));
				bookList.add(bookVo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
        } finally {
        	this.closeConnect();
        }
        return bookList;
	}
	
	/**
	 * ユーザ一覧の取得
	 * */
	public List<UserVo> selectUserList(){
		List<UserVo> userList = new ArrayList<UserVo>();
		try {
			this.connect();
			
			rs = stmt.executeQuery("SELECT * FROM user");
			while(rs.next()){
				UserVo userVo = new UserVo();
				userVo.setUserid(rs.getString("userid"));
				userVo.setUsername(rs.getString("username"));
				userVo.setAge(rs.getInt("age"));
				userVo.setSex(rs.getString("sex"));
				userVo.setMoney(rs.getInt("money"));
				userList.add(userVo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
        	this.closeConnect();
		}
		return userList;
	}
	
	/**
	 * 次のBookIdを取得
	 * */
	public int selectNextBookId(){
		int nextid = -1; 
		try {
			this.connect();
			
            rs = stmt.executeQuery("SELECT max(bookid) as maxid FROM book");
            rs.next();
            nextid = rs.getInt("maxid") + 1;
            return nextid;
			
		} catch (Exception e) {
			e.printStackTrace();
        } finally {
        	this.closeConnect();
        }
        return nextid;
	}
	
	
	/**
	 * 本の登録
	 * */
	public int insertBook(int nextId, String title, String userId, int price){
		int result = 0;
		try {
			this.connect();
            result = stmt.executeUpdate("INSERT INTO book(bookid,title,userid,price)" +
            		" VALUES("+nextId+",'"+title+"','"+userId+"',"+price+")");
            
		} catch (Exception e) {
			e.printStackTrace();
        } finally {
        	this.closeConnect();
        }
        return result;
	}
	
	/**
	 * 本の削除
	 * */
	public int deleteBook(int bookId){
		int result = 0;
		try {
			this.connect();
            result = stmt.executeUpdate("DELETE FROM book WHERE bookid = " + bookId);
            
		} catch (Exception e) {
			e.printStackTrace();
        } finally {
        	this.closeConnect();
        }
        return result;
	}
}
