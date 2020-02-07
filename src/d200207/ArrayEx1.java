package d200207;

public class ArrayEx1 {
	public static void main(String[] args) {
		int []a=new int[5];
		
		for (int i=0;i<a.length;i++) {//5번 반복
			a[i]=i+1;
		}

		//배열 출력하는 기존의 방법
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("==이하 향상된 for문의 출력==");
		
		//향상된 for문
		// JDK 1.5부터 가능 (현업은 보통 JDK 1.7)
		// 좌변은 배열이 담는 자료형에 따른 변수: 우변은 집합(배열) 
		for(int n:a) {// 배열의 자료형에 맞춰 변수명 정의:반복가능한 배열의 시작주소(배열의 변수명)
			//배열의 [0]번부터 끝 번 첨자까지 들어간 값을 n에 삽입하여 반복문을 수행한다.
			System.out.println(n);
		}
	}
}
