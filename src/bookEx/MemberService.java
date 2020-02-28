package bookEx;

import java.util.Scanner;

public class MemberService {
	private Scanner sc=new Scanner(System.in);
	private Member memberInfo = new MemberImpl();
	private MemberVO loginMember = null; 
	
	public Member memberInfo() {
		return memberInfo;
	}
	
	public MemberVO loginMember() {
		return loginMember;
	}
	
	public void login() {
		System.out.println("ȸ�� �α���...\n");
		
		String id, pwd;
		
		System.out.print("���̵� ? ");
		id = sc.next();
		
		System.out.print("�н����� ? ");
		pwd = sc.next();
		
		if(id.equals("admin") && pwd.equals("1234")) {
			MemberVO vo = new MemberVO();
			vo.setId("admin");
			vo.setName("������");
			vo.setPwd("1234");
			loginMember = vo;
			return;
		}
		
		MemberVO vo = memberInfo.readMember(id);
		if(vo!=null && vo.getPwd().equals(pwd)) {
			loginMember = vo;
			return;
		}
		
		System.out.println("���̵� �Ǵ� �н����尡 ��ġ���� �ʽ��ϴ�.\n");
	}
	
	public void logout() {
		loginMember = null;
		
		System.out.println("�α� �ƿ� �Ǿ����ϴ�.\n");
	}
	
	public void join() {
		System.out.println("\nȸ�� ����...");
		
		try {
			MemberVO vo = new MemberVO();
			System.out.print("���̵� ? ");
			vo.setId(sc.next());
			
			if(memberInfo.readMember(vo.getId())!=null) {
				System.out.println("��ϵ� ���̵� �Դϴ�.\n");
				return;
			}
			
			System.out.print("�н����� ? ");
			vo.setPwd(sc.next());
			
			System.out.print("�̸� ? ");
			vo.setName(sc.next());
			
			memberInfo.insertMember(vo);
			
			System.out.println("ȸ�� ������ ���������� ó�� �Ǿ����ϴ�.\n");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
