package d200130;

public class OperEx11 {
	public static void main(String[] args) {
		int x, y, z;
		boolean t;
		
		/*
		 주의사항
			논리연산자 &&는 false가 중간에 하나라도 나오면 그 이후의 항은 연산을 하지 않는다.
			논리연산자 ||는 true가 중간에 하나라도 나오면 그 이후의 항은 연산을 하지 않는다.
		∵ 비트 단위 연산이라고 하는 것은 수식의 값을 구해야 하는 것이므로 끝까지 연산을 해야 한다.
		반면, 논리연산자는 조건에서 true인지 false인지를 판별하는 것만이 목적이므로 중간에 조건을 만족하면 연산을 중단하기도 한다.
		*/

		x = y = z = 1;
		t = ((++x != 0) || (++y != 0) || (++z != 0));
		//t = ((2!=0) || 연산 중단)
		//t=true
		System.out.printf("%d, %d, %d, %b\n", x, y, z, t);//2,1,1,true

		x = y = z = 1;
		t = ((++x != 0) | (++y != 0) | (++z != 0));
		// t = ((2!=0) | (2!=0) | (2!=0));
		System.out.printf("%d, %d, %d, %b\n", x, y, z, t);
		//2,2,2,true

		x = y = z = -1;
		t = ((++x != 0) && (++y != 0) && (++z != 0));
		//t = ((0!=0) 이 false이므로 x항의 연산 이후 연산이 중단된다
		//t=false
		System.out.printf("%d, %d, %d, %b\n", x, y, z, t);//0,-1,-1,false

		x = y = z = -1;
		t = ((x++ != 0) && (++y != 0) && (++z != 0));
		//t = ((0!=0) && (0!=0)이 false이므로 y항의 연산 이후 연산이 중단된다
		//t=false
		System.out.printf("%d, %d, %d, %b\n", x, y, z, t);//0,0,-1,false
		
		x = y = z = -1;
		t = ((++x != 0) & (++y != 0) & (++z != 0));
		//t = ((0!=0) & (0!=0) & (0!=0)); // false & false & false끝까지 연산한다
		//t = false
		System.out.printf("%d, %d, %d, %b\n", x, y, z, t);//0,0,0,false
	}
}
