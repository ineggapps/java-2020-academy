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
		System.out.println("\n���� ���...");
		
		String code, subject;
		
		System.out.print("�����ڵ� ? ");
		code = sc.next();
		
		if(book.readBook(code)!=null) {
			System.out.println("��ϵ� �ڵ� �Դϴ�.\n");
			return;
		}
		
		System.out.print("������ ? ");
		subject = sc.next();
		
		BookVO vo = new BookVO();
		vo.setCode(code);
		vo.setSubject(subject);
		
		book.insertBook(vo);
		System.out.println("������ ��� �Ǿ����ϴ�.\n");
	}
	
	public void updateBook() {
		System.out.println("\n���� ����...");
	}
	
	public void deleteBook() {
		System.out.println("\n���� ����...");
	}
	
	public void findBySubject() {
		System.out.println("\n������ �˻�...");
		String subject;
		
		System.out.print("�˻��� ������ ? ");
		subject = sc.next();
		
		List<BookVO> slist = book.listBook(subject);
		System.out.println("�ڵ�\t������");
		
		for(BookVO vo : slist) {
			System.out.print(vo.getCode()+"\t");
			System.out.println(vo.getSubject());
		}
		System.out.println();
		
	}
}
