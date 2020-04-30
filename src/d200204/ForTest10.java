package d200204;

public class ForTest10 {
public static void main(String[] args) {
	int count=0;
	int s=2000000000;
	
		/* ★ 자료형 참조
		 * 대입할 때 20억 뒤에는 잘려나간다.
		 * (자료형 참조)
		 * float a=2000000000; 
		 * float b=2000000000+50; 
		 * System.out.println(a==b); 
		 * 20억50은 float형에 대입하면 20억이다. 
		 * 정밀도가 낮기 때문에...
		 */ 
	
	/*CAUTION: float형 자체가 정밀도 표현이 낮기 때문에 반복문에 사용하면 의도한 결과가 나오지 않을 수 있음.*/
	//되도록이면 float형의 사용을 지양한다.
	for(float f=s;f<s+50;f++) {
		count++;
	}
	System.out.println(count);//0
	
	for(int f=s;f<s+50;f++) {
		count++;
	}
	System.out.println(count);//50
	
	
}
}
