package user;

public class User {
	private UserVO[] list;
	private int count;

	public User() {
		allocation(10);
	}

	private void allocation(int capacity) {
		UserVO[] temp = new UserVO[capacity];
		if (list != null && count > 0) {
			System.arraycopy(list, 0, temp, 0, count);
		}
		list = temp;
	}

	public int getCount() {
		return count;
	}

	public int append(UserVO vo) {
		if (count >= list.length) {
			// �迭�� �� ���� ũ�⸦ 10 �� �ø���.
			allocation(list.length + 10);
		}
		list[count++] = vo;
		return count;
	}

	public UserVO[] getDataList() {
		return list;
	}

	//�ش� �ε����� UserVO ��ü�� ��ȯ�Ѵ�.
	public UserVO getDataList(int idx) {
		if (idx >= count || idx < 0) {
			return null;
		}
		return list[idx];
	}

}
