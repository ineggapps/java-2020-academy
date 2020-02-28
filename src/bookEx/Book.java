package bookEx;

import java.util.List;

public interface Book {
	public void insertBook(BookVO vo);
	public void updateBook(BookVO vo);
	public void deleteBook(BookVO vo);
	public List<BookVO> listBook();
	public List<BookVO> listBook(String subject);
	public BookVO readBook(String code);
	
}
