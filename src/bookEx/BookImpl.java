package bookEx;

import java.util.ArrayList;
import java.util.List;

public class BookImpl implements Book{
	private List<BookVO> list = new ArrayList<>();
	
	@Override
	public void insertBook(BookVO vo) {
		// ���� ���
		
	}

	@Override
	public List<BookVO> listBook() {
		return list;
	}

	@Override
	public BookVO readBook(String code) {
		// ���� �ڵ� �˻�
		return null;
	}
}
