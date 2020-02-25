package member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MemberImpl implements Member {

	private Scanner sc = new Scanner(System.in);
	// Ű: �̸���, ��: memberVO ��ü
	private Map<String, MemberVO> map = new HashMap<>();

	public MemberImpl() {
		map.put("jsj@gmail.com", new MemberVO("������", "1234", "01012341234", "19921002"));
		map.put("lsj@gmail.com", new MemberVO("�̼���", "4321", "01012341235", "19771112"));
		map.put("jhg@gmail.com", new MemberVO("���ѱ�", "1111", "01012341236", "19701002"));
		map.put("mdg@gmail.com", new MemberVO("������", "2222", "01012341237", "19820208"));
	}

	@Override
	public void input() {
		System.out.println("\nȸ������");
		// �̸���(Ű), �н�����, �̸�, ��ȭ��ȣ, �������
		// �̸��� �ߺ�üũ
		String email;
		System.out.print("�̸��� ? ");
		email = sc.next();

		if (map.containsKey(email)) {
			System.out.println("��ϵ� �̸����Դϴ�.");
			return;
		}

		try {
			MemberVO vo = new MemberVO();
			System.out.print("��й�ȣ ? ");
			vo.setPwd(sc.next());
			System.out.print("�̸� ? ");
			vo.setName(sc.next());
			System.out.print("��ȭ��ȣ? ");
			vo.setTel(sc.next());
			System.out.print("������� ? ");
			vo.setBirth(sc.next());

			map.put(email, vo);
		} catch (Exception e) {
			e.printStackTrace();
			sc.nextLine();
		}
	}

	@Override
	public void print() {
		System.out.println("\nȸ�� ����Ʈ");
		System.out.println("ȸ�� ��: " + map.size());
		// �̸���, �̸�, ��ȭ��ȣ, �������(+����*)
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String email = it.next();
			MemberVO vo = map.get(email);
			System.out.println(vo);
		}
		System.out.println();
	}

	class MemberInfo {
		private String email;
		private MemberVO vo;

		public String getEmail() {
			return email;
		}

		public MemberVO getVo() {
			return vo;
		}

		public MemberInfo(String email, MemberVO vo) {
			this.email = email;
			this.vo = vo;
		}
	}

	public MemberInfo authenticate() throws InvalidPasswordException, NotFoundException {
		MemberVO vo;
		String email;
		String pwd;
		
		System.out.print("�̸��� �Է� ? ");
		email = sc.next();
		vo = map.get(email);

		if (vo == null) {
			// �������� �ʴ� ���
//				System.out.println("���Ե��� ���� �̸����Դϴ�.");
			throw new NotFoundException();
		}

		System.out.print("��ȣ �Է� ? ");
		pwd = sc.next();

		if (!vo.getPwd().equals(pwd)) {
			// ��й�ȣ�� ��ġ���� ������ ���� ������
			throw new InvalidPasswordException();
		}

		return new MemberInfo(email, vo);

	}

	@Override
	public void update() {
		System.out.println("\n����");
		// �̸��� �Է�
		// ������ �˻�=>�����ϸ� pwd�Է� => ��ġ�ϸ� ���� ����
		// �����Ͱ� ���ų� �н����尡 ��ġ���� ������ ���� �޽��� �� ���� �޴���
		MemberVO vo;
		String email;

		try {
			MemberInfo info = authenticate();
			if (info == null) {
				return;
			}
			email = info.getEmail();
			vo = info.getVo();

			// ���� �۾�
			System.out.println("===���� �۾��� �����մϴ�===");
			System.out.print("��й�ȣ ? ");
			vo.setPwd(sc.next());
			System.out.print("�̸� ? ");
			vo.setName(sc.next());
			System.out.print("��ȭ��ȣ? ");
			vo.setTel(sc.next());
			System.out.print("������� ? ");
			vo.setBirth(sc.next());

			System.out.println(vo.getName() + "���� ���� ������ �Ϸ�Ǿ����ϴ�.");
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		} catch (InvalidPasswordException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete() {
		System.out.println("\nȸ�� Ż��");
		// �̸��� �Է�
		// ������ �˻� > �����ϸ� �н����� �Է� > ��ġ�ϸ� ����
		// �����Ͱ� ���ų� �н����尡 ��ġ���� ������ ���� �޽��� �� ���� �޴���
		String email;
		MemberVO vo;
		try {
			MemberInfo info = authenticate();
			if (info == null) {
				return;
			}
			email = info.getEmail();
			vo = info.getVo();

			char confirm;
			System.out.print("���� �����Ͻðڽ��ϱ�? (y/n)");
			confirm = sc.next().charAt(0);
			if (confirm == 'y' || confirm == 'Y') {
				map.remove(email);
				System.out.println(email + "�� ������ �����Ǿ����ϴ�.");
			} else {
				System.out.println("��ҵǾ����ϴ�.");
			}

		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		} catch (InvalidPasswordException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void findByEmail() {
		System.out.println("\n�̸��Ϸ� �˻�");
		String email;
		System.out.print("�˻��� �̸��� ? ");
		email = sc.next();

		MemberVO vo = map.get(email);
		if (vo == null) {
			System.out.println("��ϵ��� ���� ȸ���Դϴ�.");
			return;
		}

		System.out.println(email + " ���� ��ȸ ���...");
		System.out.println(vo.toStringExceptPwd());
		System.out.println();
	}

	@Override
	public void findByName() {
		System.out.println("\n�̸����� �˻�");

		String name;
		System.out.print("�˻��� �̸�?");
		name = sc.next();

		boolean exist = false;
		// �������ε� ������ �����Ͽ� �̸��� �˻��Ѵ�.
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String email = it.next();
			MemberVO vo = map.get(email);
			if (vo.getName().indexOf(name) >= 0) {
				System.out.println(vo.toStringExceptPwd());
				exist = true;
			}
		}

		if (!exist) {
			System.out.println(name + "�� �˻� ����� �����ϴ�...");
		}
		System.out.println();
	}

}
