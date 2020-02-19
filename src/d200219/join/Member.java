package d200219.join;

public class Member {
	private MemberVO[] list;
	private int count;

	public Member() {
		list = new MemberVO[10];
		count = 0;
	}

	public MemberVO[] getList() {
		return list;
	}

	public int getCount() {
		return count;
	}

	public int append(MemberVO vo) {
		if (count >= list.length) {
			return -1;
		}
		list[count++] = vo;
		return count;
	}

	public MemberVO get(String id) { // id �˻� �� �����ϴ� MemberVO��ü ��ȯ
		for (int i = 0; i < count; i++) {
			if (list[i].getId().equals(id)) {
				return list[i];
			}
		}
		return null;
	}
}
