package d200212;

public class Ex2 {
	public static void main(String[] args) {
		Test2 t = new Test2();
		int score = 80;
		String s ;
		s = t.hak(score);
		System.out.println(s);
		
		short n=10;
		int a= t.odd(n);//보내는 실인수는 받는 가인수보다 자료형이 작거나 같아야 한다.
		System.out.println("a:"+a);
		
		double d = t.odd(n); //반환되는 자료형보다 받는 자료형은 크거나 같으면 된다.
		//여기서 t.odd(n)은 int형으로 반환하는데 받는 자료형은 double형이다.
		//따라서 double형 변수는 int형 자료형을 받을 수 있다.
		System.out.println("d:"+d);
	}
}

class Test2 {
	public String hak(int s) {
		String h = null;
		//h를 null로 초기화시키지 않고 바로 return을 하게 되면 초기화되지 않았기 때문에 컴파일 오류가 발생한다.
		//(↑ 아래의 switch구문이 없을 경우)
		switch (s / 10) {
		case 10:
		case 9:
			h = "수";
			break;
		case 8:
			h = "우";
			break;
		case 7:
			h = "미";
			break;
		case 6:
			h = "양";
			break;
		default:
			h = "가";
			break;
		}
		return h;//반환되는 값은 언제나 1개이다.
	}
	
	public int odd(int n) {
		int s=0;
		for(int i=1;i<=n;i+=2) {
			s+=i;
		}
		return s;
	}
}
