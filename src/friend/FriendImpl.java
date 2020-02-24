package friend;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FriendImpl implements Friend {
	public static final String KEY_NAME = "name";
	public static final String KEY_TEL = "tel";

	List<FriendVO> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public FriendImpl() {
		// ���� ������
		list.add(new FriendVO("�翵��", "01000000001", "��⵵ �����ν�", "19991008"));
		list.add(new FriendVO("�һ��", "01000000002", "��⵵ ��õ��", "19891008"));
		list.add(new FriendVO("�Ѹ���", "01000000003", "��⵵ ���ֽ�", "19791008"));
		list.add(new FriendVO("ä����", "01000000004", "����Ư���� ������", "19691008"));
		list.add(new FriendVO("�ֿ�ö", "01000000005", "����Ư���� ������", "19591008"));
		list.add(new FriendVO("������", "01000000006", "����Ư���� ������", "19790708"));
		list.add(new FriendVO("�ֿ�ö", "01000000007", "����Ư���� ���ϱ�", "19591008"));
		list.add(new FriendVO("������", "01000000008", "��⵵ ����", "19591008"));
		list.add(new FriendVO("���߹�", "01000000009", "������ ������", "19591008"));
		list.add(new FriendVO("���ʽ�", "01000000010", "������ ��õ��", "19591008"));
		list.add(new FriendVO("���ʾ�", "01000000011", "��⵵ ������", "19591008"));
	}

	@Override
	public void input() {
		System.out.println("\nģ�� ���");

		// ������ �̸��� ������ ��ȭ��ȣ�� ������ ��� �Ұ���
		FriendVO vo = inputProcess();
		list.add(vo);
	}

	public FriendVO inputProcess() {
		FriendVO vo = new FriendVO();
		System.out.print("�̸� ? ");
		vo.setName(sc.nextLine());
		return inputProcess(vo, false);
	}

	public FriendVO inputProcess(FriendVO vo, boolean isUpdate) {
		// �̹� �ش� ��ȭ��ȣ�� ����� �Ǿ��ֳ�?
		boolean valid = false;
		String tel;
		if (isUpdate) {
			System.out.print("�̸� ? ");
			vo.setName(sc.nextLine());
		}
		do {
			System.out.print("��ȭ��ȣ ? ");
			tel = sc.nextLine().replaceAll("-", "");
			valid = isCheckDuplicate(vo.getName(), tel);
			if (valid) {
				vo.setTel(tel);
			} else {
				System.out.println("�̹� ��ϵ� ��ȭ��ȣ�Դϴ�. �ٽ� �Է��ϼ���.");
			}
		} while (!valid);// ��ȿ���� ������ ��� �ٽ� �Է� ����
		System.out.print("�ּ� ? ");
		vo.setCity(sc.nextLine());
		System.out.print("������� ? ");
		vo.setBirth(sc.nextLine().replaceAll("(\\-|\\.|/)", ""));
		return vo;
	}

	@Override
	public void print() {
		System.out.println("\nģ�� ���...");
		// �̸�, ��ȭ��ȣ, �ּ�, �������, ����(�޼��� ����)
		int limit = 10;
		int maxPage = (list.size() / limit) + 1;
		for (int i = 0; i < list.size(); i++) {
			FriendVO vo = list.get(i);
			System.out.print((i + 1) + ": ");
			System.out.print(vo);
			System.out.print(", �� " + toAge(vo.getBirth()) + "��");
			System.out.println();
			if ((i + 1) % limit == 0) {
				System.out.printf("Next(%d/%d) > ", (i / limit) + 2, maxPage);
				sc.nextLine();
			}
		}
		// �� ȭ�鿡 10����
	}

	public void print(List<FriendVO> list) {
		for (FriendVO vo : list) {
			System.out.println(vo);
		}
	}

	@Override
	public void findByName() {
		System.out.println("\n�̸� �˻�...");
		// �պκа� ��ġ�ص� �˻� (ȫ�浿�� 'ȫ'�ڸ� �Է��ص� �˻��� �ǵ���)
		String name;
		System.out.print("�̸� ? ");
		name = sc.nextLine();
		List<FriendVO> target = new ArrayList<>();
		for (FriendVO vo : list) {
			if (vo.getName().startsWith(name)) {
				target.add(vo);
			}
		}
		if (target.size() == 0) {
			System.out.println(name + ": �˻� ��� ����...");
			return;
		}
		print(target);
	}

	@Override
	public void update() {
		System.out.println("\n���� ����...");
		// ���� �۾�
		// �̸�, ��ȭ��ȣ, �ּ�, ������� ��� ����
		// �̸��� ��ȭ��ȣ�� �ڽ��� �ƴ� �ٸ� ����� ��ġ�ϸ� ���� �Ұ���
		Map<String, String> map = getNameAndTel();
		// ���� �۾�
		FriendVO vo = readFriend(map.get(KEY_NAME), map.get(KEY_TEL));
		// ��ϵ� �ڷᰡ �ִ���?
		if (vo == null) {
			System.out.println("���ǿ� �����ϴ� ���� �����ϴ�.");
			return;
		}
		System.out.println("���� ������ �ʿ��� ���� �Է��� �ּ���.");
		inputProcess(vo,true);
	}

	@Override
	public void delete() {
		System.out.println("\nģ�� ����...");
		// �̸��� ��ȭ��ȣ�� ������ ������ ����
		Map<String, String> map = getNameAndTel();
		FriendVO vo = readFriend(map.get(KEY_NAME), map.get(KEY_TEL));
		if (vo == null) {
			System.out.println("���� ����: ��ġ�ϴ� ������ �����ϴ�.");
			return;
		}
		System.out.println("������ �Ϸ��Ͽ����ϴ�.");
		System.out.println("������ Į��: " + vo);
		list.remove(vo);
	}

	public Map<String, String> getNameAndTel() {
		String name;
		String tel;
		System.out.print("�̸� ? ");
		name = sc.nextLine();
		System.out.print("��ȭ��ȣ ?");
		tel = sc.nextLine();

		Map<String, String> map = new HashMap<String, String>();
		map.put(KEY_NAME, name);
		map.put(KEY_TEL, tel);
		return map;
	}

	private FriendVO readFriend(String name, String tel) {
		// �̸��� ��ȭ��ȣ�� ������ ģ���� �˻�
		for (FriendVO vo : list) {
			if (vo.getName().startsWith(name) && vo.getTel().equals(tel)) {
				return vo;
			}
		}
		return null;
	}

	public boolean isCheckDuplicate(String name, String tel) {
		for (FriendVO vo : list) {
			if (vo.getName().equals(name) && vo.getTel().equals(tel)) {
				return false;
			}
		}
		return true;/// �ߺ����� ������ true�� ��ȯ�Ѵ�.
	}

	public boolean isCheckDate(String birth) {
		birth = birth.replaceAll("(\\-|\\.|/)", "");
		if (birth.length() != 8) {
			return false;
		}

		try {
			int y = Integer.parseInt(birth.substring(0, 4));
			int m = Integer.parseInt(birth.substring(4, 6));
			int d = Integer.parseInt(birth.substring(6));

			if (m < 1 || m > 12) {
				return false;
			}

			Calendar cal = Calendar.getInstance();
			cal.set(y, m - 1, 1);
			int days = cal.getActualMaximum(Calendar.DATE);
			if (d < 1 || d > days) {
				return false;
			}

		} catch (Exception e) {
			return false;
		}

		return true;
	}

	public int toAge(String birth) {
		int age = 0;

		if (!isCheckDate(birth)) {
			throw new RuntimeException("��¥ ���� ����...");
		}

		birth = birth.replaceAll("(\\-|\\.|/)", "");

		try {
			int y = Integer.parseInt(birth.substring(0, 4));
			int m = Integer.parseInt(birth.substring(4, 6));
			int d = Integer.parseInt(birth.substring(6));

			Calendar now = Calendar.getInstance();

			age = now.get(Calendar.YEAR) - y;
			if (m > now.get(Calendar.MONTH) + 1
					|| m == now.get(Calendar.MONTH) + 1 && d > now.get(Calendar.DAY_OF_MONTH)) {
				age--;
			}
		} catch (Exception e) {
			throw new RuntimeException("��¥ ���� ����...");
		}

		return age;
	}

}
