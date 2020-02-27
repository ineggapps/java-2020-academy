package bookEx;

import java.util.List;

public interface Book {
	public void insertBook(BookVO vo);
	public List<BookVO> listBook();
	public BookVO readBook(String code);
}
