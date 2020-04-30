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
		System.out.println("회원 로그인...\n");
		
		String id, pwd;
		
		System.out.print("아이디 ? ");
		id = sc.next();
		
		System.out.print("패스워드 ? ");
		pwd = sc.next();
		
		if(id.equals("admin") && pwd.equals("1234")) {
			MemberVO vo = new MemberVO();
			vo.setId("admin");
			vo.setName("관리자");
			vo.setPwd("1234");
			loginMember = vo;
			return;
		}
		
		MemberVO vo = memberInfo.readMember(id);
		if(vo!=null && vo.getPwd().equals(pwd)) {
			loginMember = vo;
			return;
		}
		
		System.out.println("아이디 또는 패스워드가 일치하지 않습니다.\n");
	}
	
	public void logout() {
		loginMember = null;
		
		System.out.println("로그 아웃 되었습니다.\n");
	}
	
	public void join() {
		System.out.println("\n회원 가입...");
		
		try {
			MemberVO vo = new MemberVO();
			System.out.print("아이디 ? ");
			vo.setId(sc.next());
			
			if(memberInfo.readMember(vo.getId())!=null) {
				System.out.println("등록된 아이디 입니다.\n");
				return;
			}
			
			System.out.print("패스워드 ? ");
			vo.setPwd(sc.next());
			
			System.out.print("이름 ? ");
			vo.setName(sc.next());
			
			memberInfo.insertMember(vo);
			
			System.out.println("회원 가입이 정상적으로 처리 되었습니다.\n");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
