package bookEx;

import java.util.ArrayList;
import java.util.List;

public class BookImpl implements Book{
	private List<BookVO> list = new ArrayList<>();
	
	public BookImpl() {
		list.add(new BookVO("101", "오라클"));
		list.add(new BookVO("102", "재미있는오라클"));
		list.add(new BookVO("201", "자바와놀자"));
		list.add(new BookVO("202", "자바정복"));
		list.add(new BookVO("301", "HTML"));
	}
	
	@Override
	public void insertBook(BookVO vo) {
		// 도서 등록
		list.add(vo);
	}

	@Override
	public List<BookVO> listBook() {
		return list;
	}
	
	@Override
	public List<BookVO> listBook(String subject) {
		// 도서명 검색
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
		// 도서 코드 검색
		for(BookVO vo : list) {
			if(vo.getCode().equals(code)) {
				return vo;
			}
		}
		
		return null;
	}

	@Override
	public void updateBook(BookVO vo) {
		// 도서 수정
		
	}

	@Override
	public void deleteBook(BookVO vo) {
		// 도서 삭제
		
	}
}
