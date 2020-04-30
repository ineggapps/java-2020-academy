package d200225;
import java.util.Set;
import java.util.TreeSet;

public class Ex12 {
	public static void main(String[] args) {
		Set<TestVO> set = new TreeSet<TestVO>();

		set.add(new TestVO("너너너", 10));
		set.add(new TestVO("하하하", 28));
		set.add(new TestVO("더더더", 23));

		for (TestVO vo : set) {
			System.out.println(vo);
		}
		System.out.println();
	}
}

//Comparable 구현
class TestVO implements Comparable<TestVO> {

	private String name;
	private int age;

	public TestVO() {
	}

	public TestVO(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(TestVO o) {
		return name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "TestVO [name=" + name + ", age=" + age + "]";
	}

}