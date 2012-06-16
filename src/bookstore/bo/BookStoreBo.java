package bookstore.bo;

import java.util.List;

import bookstore.dao.BookStoreDao;
import bookstore.vo.BookVo;
import bookstore.vo.UserVo;

public class BookStoreBo {
	private BookStoreDao dao;
	
	public BookStoreBo(){
		dao = new BookStoreDao();	
	}
	
	public List<BookVo> getBookList(){
		return dao.selectBookList();
	}
	
	public List<UserVo> getUserList(){
		return dao.selectUserList();
	}
	
	/** @MEMO : このロジックだと、データ不整合を起こす可能性があります。さて、何故でしょう？^^ */
	public void registNewBook(String title, String userId, int price){
		if(title == null || userId == null || price < 0){
			throw new IllegalArgumentException("entar value is invalid.");
		}

		int nextId = dao.selectNextBookId();
		dao.insertBook(nextId, title, userId, price);
	}
	
	public void deleteBook(int bookId){
		if(bookId < 1){
			throw new IllegalArgumentException("entar value is invalid.");
		}
		dao.deleteBook(bookId);
	}
	
}
