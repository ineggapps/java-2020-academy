package friend;

import java.util.ArrayList;
import java.util.List;

public class FriendImpl implements Friend {

	List<FriendVO> list = new ArrayList<>();

	@Override
	public void input() {
		System.out.println("\nģ�� ���");
		
		//������ �̸��� ������ ��ȭ��ȣ�� ������ ��� �Ұ���
		
		
	}

	@Override
	public void print() {
		System.out.println("\nģ�� ���...");
		//�̸�, ��ȭ��ȣ, �ּ�, �������, ����(�޼��� ����)
		
		//�� ȭ�鿡 10����
	}

	@Override
	public void findByName() {
		System.out.println("\n�̸� �˻�...");
		//�պκа� ��ġ�ص� �˻� (ȫ�浿�� 'ȫ'�ڸ� �Է��ص� �˻��� �ǵ���)
		
	}

	@Override
	public void update() {
		System.out.println("\n���� ����...");

	}

	@Override
	public void delete() {
		System.out.println("\nģ�� ����...");
		//�̸��� ��ȭ��ȣ�� ������ ������ ����
		//�̸�, ��ȭ��ȣ, �ּ�, ������� ��� ����
		//	�̸��� ��ȭ��ȣ�� �ڽ��� �ƴ� �ٸ� ����� ��ġ�ϸ� ���� �Ұ���
		
	}

	private FriendVO readFriend(String name, String tel) {
		//�̸��� ��ȭ��ȣ�� ������ ģ���� �˻�
		
		return null;
	}
}
