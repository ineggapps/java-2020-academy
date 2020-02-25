import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex6 {
	public static void main(String[] args) {
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("������", "010", 26));
		list.add(new UserVO("������", "011", 20));
		list.add(new UserVO("������", "012", 22));
		list.add(new UserVO("������", "013", 25));
		list.add(new UserVO("������", "014", 23));

		print("���� ��", list);

		// ����
		// ũ�� ������ ����: Comparable �������̽��� ������ Ŭ������ ����
		// Collection.sort(list); //�Ŀ��� - Comparable �������̽��� �����Ǿ� ���� �ʱ� �����̴�.
		// (���ؿ� ����)
		// UserVO�� �̸�, ��ȭ��ȣ, ���̸� ��� �ִµ� ������ �������� �������� �˷��ֱ�
		// compareTo(UserVO o) �޼��带 �������̵��� �� Collections�� sort�޼��带 ȣ���Ѵ�.
		Collections.sort(list);

		print("���� ��", list);
	}

	public static void print(String title, List<UserVO> list) {
		System.out.println(title);
		for (UserVO vo : list) {
			System.out.println(vo);
		}
	}
}

class UserVO implements Comparable<UserVO> {
	// Comparable(���� ����) �������̽��� ������ Ŭ���� ����
	private String name;
	private String tel;
	private int age;

	public UserVO() {

	}

	public UserVO(String name, String tel, int age) {
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

	// comparableTo: Comparable�޼���� ���� ������ �����Ѵ�
	// String Ŭ������ compareTo - ���� ������ ��
	// ȥ�� ����

	@Override
	public int compareTo(UserVO o) {
//		 StringŬ������ compareTo(): ���ڿ��� ���� ������ ��
//		 return name.compareTo(o.getName());//�̸� �������� ��
//		 return -name.compareTo(o.getName());//�̸� �������� ��
		return age - o.getAge();// ���� ��������
//		 return -(age-(o.getAge())); //���� ������
	}

	@Override
	public String toString() {
		return "UserVO [name=" + name + ", tel=" + tel + ", age=" + age + "]";
	}

}