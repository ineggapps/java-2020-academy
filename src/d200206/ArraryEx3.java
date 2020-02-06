package d200206;

public class ArraryEx3 {
	public static void main(String[] args) {
		//★자바의 배열은 객체이다!
		//review: 기본 자료형(primitive type), 참조 자료형(reference type) 이 있다.
		//배열은 참조자료형이다. ("배열", 클래스, 인터페이스, …)
		int []score=new int[5];//int형 변수가 아니라 참조형 변수이다.
		//new: 메모리를 잡는 연산자
		//score 배열의 이름은 해당 변수의 시작 주소라고 생각하면 된다.
		//new int[5]라는 선언은 컴퓨터는 기억장치에 연속적인 공간을 할당하여 메모리 주소의 위치를 가리키도록 한다.
		//연속적으로 공간을 가리키므로 메모리에서 배열의 가장 첫 주소의 위치를 score에 입력하여 준다.
		//※ C언어의 포인터 개념과 유사하지만 JAVA에서는 포인터는 JVM만 조작이 가능하다.
		//※ JAVA에서는 메모리 주소를 사용자가 전혀 참조할 수 없기 떄문에 메모리를 직접 해제할 필요도 없다.
		//=> Garbage Collector가 사용하지 않는 메모리 주소를 파악하여 자동으로 정리한다.
		int tot, ave;
		
		
		//스택, 힙
//		int a; // 스택 메모리 영역에 저장한다
//		int b[]; //힙 메모리 영역에 저장한다.
		
		score[0]=60;
		score[1]=70;
		score[2]=80;
		score[3]=70;
		score[4]=80;
		
//		score = new int[6];//기존의 공간을 확장할 수는 없고, new int[6]로 새로 선언하게 되면 새로운 공간이 할당된다.
		//이전에 할당받은 공간은 JVM에 의해 수거됨.
		
		//[첨자] << 첨자 공간은 byte, short, char, int만 가능 (long 불가능)
		tot=0;
		for(int i=0;i<score.length;i++) {
			tot+=score[i];
		}
		ave=tot/score.length;
		
		System.out.printf("합계: %d, 평균: %d%n",tot,ave);
		System.out.println(score);//==Hashcode (일단은 배열의 주소를 출력해 준다고 생각하자)
	}
}
