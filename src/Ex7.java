import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex7 {
	public static void main(String[] args) {
		// Ex6 ArrayListSort�� �ٸ� ������� ����
		// �� ����� ����ϱ�.
		List<UserDTO> list = new ArrayList<UserDTO>();
		list.add(new UserDTO("������", "010", 25));
		list.add(new UserDTO("������", "011", 20));
		list.add(new UserDTO("������", "012", 22));
		list.add(new UserDTO("������", "013", 25));
		list.add(new UserDTO("������", "014", 23));

		print("���� ��", list);// static�̹Ƿ� �ٷ� �θ� �� ����.

		// ũ��� ����
		// �̸����� ����
		// Comparator �������̽� ����: ���� ���� ����
		Comparator<UserDTO> comp = new Comparator<UserDTO>() {

			@Override
			public int compare(UserDTO o1, UserDTO o2) {
				return o1.getName().compareTo(o2.getName());// ��������
//				return -o1.getName().compareTo(o2.getName());//��������
				// name �׸��� String�̴ϱ� ��ü �޼����� compareTo �̿��Ͽ� ��
			}
		};

		Collections.sort(list, comp);
		print("�̸� ���� ��", list);

		// ���� ����
		Comparator<UserDTO> comp2 = new Comparator<UserDTO>() {

			@Override
			public int compare(UserDTO o1, UserDTO o2) {
				return o1.getAge() - o2.getAge();// ��������
//				return -(o1.getAge()-o2.getAge());//��������
			}
		};

		Collections.sort(list, comp2);
		print("���� ���� ��", list);

	}

	public static void print(String title, List<UserDTO> list) {
		System.out.println(title);
		for (UserDTO vo : list) {
			System.out.println(vo);
		}
		System.out.println();
	}

}

class UserDTO {
	private String name;
	private String tel;
	private int age;

	public UserDTO() {
	}

	public UserDTO(String name, String tel, int age) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", tel=" + tel + ", age=" + age + "]";
	}

}