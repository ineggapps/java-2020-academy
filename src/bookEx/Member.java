package bookEx;

import java.util.List;

public interface Member {
	public void insertMember(MemberVO vo);
	public MemberVO readMember(String id);
	public List<MemberVO> listMember();
}
