package d200219.join;

import java.util.Arrays;

public class MemberResult {
	private Member member;
//	private Member member = new Member();

	MemberResult(Member member) {
		this.member = member;
	}

	public void write() {
		MemberVO[] list = member.getList();
		System.out.println(Arrays.toString(list));
		for (int i = 0; i < member.getCount(); i++) {
			MemberVO vo = list[i];
			//MemberVO vo = member.getList()[i];
			System.out.println(vo);
		}
		System.out.println();
	}
}
