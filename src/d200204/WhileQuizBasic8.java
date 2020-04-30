package d200204;

public class WhileQuizBasic8 {
	public static void main(String[] args) {
		int n=0,s=0,ss=0;
		//n: 20번째 항까지 반복문을 실행시키기 위한 변수
		
		/*
		계차수열: 		1		2		4		7		11
		등차수열:		0		1		2		3		4
		
		 IDEA: 
		계차수열의 4는 1(계차수열의 첫 항) + 0+1+2 (등차수열의 1~3항) 이다.
		 * */
		while(n<20) {
			s+=n++; //(계차수열의 공차 구하기)
			ss+=1+s;
		}
		System.out.println("결과: "+ss);
	}
	/*
	 *
	선생님 답안 TODO: 디버깅 해 보기
	int n,s,t;
	 n=0; s=0;
	 t=1;
	 while(n<20){
	 	s+=t;
	 	n++;
	 	t+=n;
	 }
	 결과 s출력
	 * */
}
