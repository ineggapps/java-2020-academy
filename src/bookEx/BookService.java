package bookEx;

import java.util.List;
import java.util.Scanner;

public class BookService {
	private Scanner sc=new Scanner(System.in);	
	private Book book;
	
	public BookService(Book book) {
		this.book = book;
	}
	
	public void insertBook() {
		System.out.println("\n도서 등록...");
		
		String code, subject;
		
		System.out.print("도서코드 ? ");
		code = sc.next();
		
		if(book.readBook(code)!=null) {
			System.out.println("등록된 코드 입니다.\n");
			return;
		}
		
		System.out.print("도서명 ? ");
		subject = sc.next();
		
		BookVO vo = new BookVO();
		vo.setCode(code);
		vo.setSubject(subject);
		
		book.insertBook(vo);
		System.out.println("도서가 등록 되었습니다.\n");
	}
	
	public void updateBook() {
		System.out.println("\n도서 수정...");
	}
	
	public void deleteBook() {
		System.out.println("\n도서 삭제...");
	}
	
	public void findBySubject() {
		System.out.println("\n도서명 검색...");
		String subject;
		
		System.out.print("검색할 도서명 ? ");
		subject = sc.next();
		
		List<BookVO> slist = book.listBook(subject);
		System.out.println("코드\t도서명");
		
		for(BookVO vo : slist) {
			System.out.print(vo.getCode()+"\t");
			System.out.println(vo.getSubject());
		}
		System.out.println();
		
	}
}
