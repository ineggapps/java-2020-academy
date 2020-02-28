package bookEx;

import java.util.ArrayList;
import java.util.List;

public class BookImpl implements Book{
	private List<BookVO> list = new ArrayList<>();
	
	public BookImpl() {
		list.add(new BookVO("101", "����Ŭ"));
		list.add(new BookVO("102", "����ִ¿���Ŭ"));
		list.add(new BookVO("201", "�ڹٿͳ���"));
		list.add(new BookVO("202", "�ڹ�����"));
		list.add(new BookVO("301", "HTML"));
	}
	
	@Override
	public void insertBook(BookVO vo) {
		// ���� ���
		list.add(vo);
	}

	@Override
	public List<BookVO> listBook() {
		return list;
	}
	
	@Override
	public List<BookVO> listBook(String subject) {
		// ������ �˻�
		List<BookVO> slist = new ArrayList<BookVO>();
		
		for(BookVO vo : list) {
			if(vo.getSubject().indexOf(subject)>=0) {
				slist.add(vo);
			}
		}
		
		return slist;
	}

	@Override
	public BookVO readBook(String code) {
		// ���� �ڵ� �˻�
		for(BookVO vo : list) {
			if(vo.getCode().equals(code)) {
				return vo;
			}
		}
		
		return null;
	}

	@Override
	public void updateBook(BookVO vo) {
		// ���� ����
		
	}

	@Override
	public void deleteBook(BookVO vo) {
		// ���� ����
		
	}
}
