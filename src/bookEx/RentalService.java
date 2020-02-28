package bookEx;

import java.util.Calendar;
import java.util.Scanner;

public class RentalService {
	private Scanner sc=new Scanner(System.in);
	private Rental rental = new RentalImpl();
	private Book book;
	
	public RentalService(Book book) {
		this.book = book;
	}
	
	public void bookRental(MemberVO loginMember) {
		System.out.println("도서 대여...\n");
		
		String code, rentalDate;
		char ch;
		
		try {
			System.out.print("대여할 도서 코드 ? ");
			code = sc.next();
			RentalVO rvo = rental.readRental(code);
			if(rvo!=null) {
				System.out.println("도서가 대여 중입니다.\n");
				return;
			}
			
			BookVO bvo = book.readBook(code);
			if(bvo == null) {
				System.out.println("등록된 도서가 아닙니다.\n");
				return;
			}
			
			System.out.print(bvo.getSubject()+" 도서를 대여 하시겠습니까[Y/N] ? ");
			ch = sc.next().charAt(0);
			
			if(ch != 'Y' && ch != 'y') {
				return;
			}
			
			rentalDate = String.format("%tF", Calendar.getInstance());
			
			System.out.println("::::::"+loginMember);
			RentalVO vo = new RentalVO();
			vo.setId(loginMember.getId());
			vo.setCode(code);
			vo.setRentalDate(rentalDate);
			
			rental.insertRental(vo);
			
			System.out.println("대여가 완료 되었습니다.\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void bookReturn(MemberVO loginMember) {
		System.out.println("도서 반납...\n");
		
		String code, rentalDate;
		
		try {
			System.out.print("반납할 도서 코드 ? ");
			code = sc.next();
			
			RentalVO vo = rental.readRental(code);
			if(vo == null || ! vo.getId().equals(loginMember.getId())) {
				System.out.println("대여 코드가 아닙니다.\n");
				return;
			}
			
			rentalDate = String.format("%tF", Calendar.getInstance());
			vo.setRentalDate(rentalDate);
			
			System.out.println("반납이 완료 되었습니다.\n");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
