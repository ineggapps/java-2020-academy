import com.test.MyUtil;

public class UserApp {
	public static void main(String[] args) {
		User ob = new User();
		ob.name="ÀÚ¹Ù";
		ob.sub();
		ob.print();
	}
}


class User extends MyUtil{
	public void sub() {
		tel = "123-1234-1234";
//		age=10;
	}
}