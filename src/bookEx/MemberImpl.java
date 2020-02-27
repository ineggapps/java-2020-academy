package bookEx;

import java.util.ArrayList;
import java.util.List;

public class MemberImpl implements Member {
	private List<MemberVO> list = new ArrayList<>();
	
	@Override
	public void insertMember(MemberVO vo) {
		list.add(vo);
	}

	@Override
	public MemberVO readMember(String id) {
		for(MemberVO vo : list) {
			if(vo.getId().equals(id)) {
				return vo;
			}
		}
		return null;
	}

	@Override
	public List<MemberVO> listMember() {
		return list;
	}
}
