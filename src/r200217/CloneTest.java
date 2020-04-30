package r200217;

public class CloneTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("홍길동");
		try {
			Person p2 = p1.clone();
			System.out.println(p2.getName());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
}

class Person implements Cloneable{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	@Override
	protected Person clone() throws CloneNotSupportedException {
		return (Person)super.clone();//공변 반환타입으로도 지정이 가능하다
	}
	
}
