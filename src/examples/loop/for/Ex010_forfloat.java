
public class Ex010_forfloat {
	public static void main(String[] args) {
/*
     for 문에 float 형 증감변수를 사용한 예
     for 문에서는 절대 float을 증감변수로 사용하지 않는다.
 */
		int start = 2000000000;
		int count = 0;
		for (float f = start; f < start + 50; f++) {
			count++;
		}

		// 아래의 결과는 몇 일까 ? 50?
		System.out.println(count); // 0
		
/*
    - 부정확한 부동소수점 연산의 결과
       double total = 0;
       total += 4.7;
       total += .4;
       System.out.println(total); // 5.1000000000000005
      	     
	 - int 형의 2,000,000,000과 2,000,000,050은 분명 다른 값이지만 이 값을 float 형으로 변환하면 둘은 같은 값이 된다.
	   int value1 = 2_000_000_000;
	   int value2 = 2_000_000_050;

	   float fValue1 = 2_000_000_000;
	   float fValue2 = 2_000_000_050;

	   // int 형의 value1과 value2는 다른 값이다.
	   System.out.println("int 형 " + value1 + "은 "+ value2 +"와 " + (value1 == value2 ? "같다" : "다르다"));

	   // float 형의 fValue1과 fValue2는 같은 값이다.
	   System.out.println("float 형 " + fValue1 + "은 "+ fValue2 +"와 " + (fValue1 == fValue2 ? "같다" : "다르다"));
	   // 두 값 모두 float에서는 2.0E9     
*/		
	}
}
