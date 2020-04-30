package d200129;

import java.util.Scanner;
/*
 * 체중과 키를 입력 받아 BMI(체질량지수)를 계산하는 프로그램을 작성하시오.
 * [처리조건]
 * - 체중의 입력 단위는 kg이며 입력은 Scanner 클래스의 nextDouble() 메서드를 이용하여 실수를 입력 받는다.
 * - 키의 입력 단위는 cm이며 입력은 Scanner 클래스의 nextDouble() 메서드를 이용하여 실수로 입력 받는다.
 * - 체중은 kg, 키는 m 단위로 출력하며 소수점 셋 째 자리에서 반올림하여 소수점 두 자리로 출력한다.
 * - BMI 출력은 소수점 둘 째 자리에서 방놀림하여 소수점 한 자리로 출력한다.
 * [문제 설명]
 * - BMI(체질량지수, Body Mass Index)
 * BMI는 성인의 신장과 체중을 이용하여 지방의 양을 추정하는 공식으로 체지방률 및 건강 위험도를 반영하는 지표라고 할 수 있다. 
 * 하지만 BMI는 신장과 체중만을 이용하여 계산되므로 사람이 같은 체질량지수를 가져도 체지방률은 다를 수 있다.
 * BMI = 체중 / (키*키)
 * 체중 단위는 kg이며 키는 m이다.
 * 예를 들어 체중이 80kg이고 키가 183cm(1.83m)이면
 * BMI = 80 / (1.83 * 1.83) = 23.9이다.
 * - BMI에 따른 체중 상태
 * 18.5이하: 저체중
 * 18.5 ~ 24.9: 정상
 * 25.0 ~ 29.9: 과체중
 * 30.0 이상: 비만
 * */
public class OperQuiz6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double weight, height, heightM, bmi;
		System.out.print("체중(kg) ? ");
		weight = sc.nextDouble();
		System.out.print("키(cm) ? ");
		height = sc.nextDouble();
		
		heightM = height*0.01;
		bmi = weight / (heightM * heightM);
		
		//결괏값
		System.out.printf("몸무게: %.2fkg\n",weight);
		System.out.printf("키: %.2fm\n",height*0.01);
		System.out.printf("BMI: %.1f\n",bmi);
		sc.close();	
	}
}
