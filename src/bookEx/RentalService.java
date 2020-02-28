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
		System.out.println("���� �뿩...\n");
		
		String code, rentalDate;
		char ch;
		
		try {
			System.out.print("�뿩�� ���� �ڵ� ? ");
			code = sc.next();
			RentalVO rvo = rental.readRental(code);
			if(rvo!=null) {
				System.out.println("������ �뿩 ���Դϴ�.\n");
				return;
			}
			
			BookVO bvo = book.readBook(code);
			if(bvo == null) {
				System.out.println("��ϵ� ������ �ƴմϴ�.\n");
				return;
			}
			
			System.out.print(bvo.getSubject()+" ������ �뿩 �Ͻðڽ��ϱ�[Y/N] ? ");
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
			
			System.out.println("�뿩�� �Ϸ� �Ǿ����ϴ�.\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void bookReturn(MemberVO loginMember) {
		System.out.println("���� �ݳ�...\n");
		
		String code, rentalDate;
		
		try {
			System.out.print("�ݳ��� ���� �ڵ� ? ");
			code = sc.next();
			
			RentalVO vo = rental.readRental(code);
			if(vo == null || ! vo.getId().equals(loginMember.getId())) {
				System.out.println("�뿩 �ڵ尡 �ƴմϴ�.\n");
				return;
			}
			
			rentalDate = String.format("%tF", Calendar.getInstance());
			vo.setRentalDate(rentalDate);
			
			System.out.println("�ݳ��� �Ϸ� �Ǿ����ϴ�.\n");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
