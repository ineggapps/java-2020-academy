package d200220;

import java.util.Arrays;

public class Ex4 {
	public static void main(String[] args) {
		SortInt s = new SelectionSort();
		SortInt s2 = new BubbleSort();
		System.out.println("선택 정렬");
		s.sort(new int[] { 2, 4, 99, 3, 5 });
		System.out.println("버블 정렬");
		s2.sort(new int[] { 2, 4, 99, 3, 5 });
	}
}

abstract class SortInt {
	private int[] value;

	protected abstract void sorting();// 추상 메서드

	public void sort(int[] value) {
		this.value = value;
		sorting();// ★ 아직 내용이 정의되지 않은 추상메서드임에도 불구하고 호출할 수 있다니!
		//어차피 abstract클래스는 객체생성을 못하지만
		//객체를 생성할 수 있는 상속받는(extended된 클래스) 클래스들은 이미 재정의를 했을 테니까!
		//확장한 클래스의 메서드, 즉 기술된 메서드의 sorting()를 호출하는 거니까 상관이 없겠구나!
	}

	protected int length() {
		return value == null ? -1 : value.length;
	}

	protected final int compare(int i, int j) {
		return value[i] - value[j];
	}

	protected void swap(int i, int j) {
		int t = value[i];
		value[i] = value[j];
		value[j] = t;
	}

	public void print() {
		if (value == null) {
			return;
		}
		System.out.println(Arrays.toString(value));
	}
}

class SortIntReal extends SortInt {

	@Override
	protected void sorting() {

	}

}

//추상화 작업 (selection sort)
//필드
//		value[]: int
//메서드
//		정렬
//		비교
//		맞교환
//		데이터 길이 확인

// 어떤 정렬법이든 정렬, 비교, 맞교환, 데이터 길이를 확인하는 절차는 무조건 들어간다.
// 다만 정렬할 때의 과정만 다를 뿐이다. (정렬)

//추상 클래스를 상속 받은 클래스가 추상 클래스가 아니면 
//반드시 몯느 추상 메서드를 오버라이딩하여 실제로 구현해야 한다.
class SelectionSort extends SortInt {
	@Override
	protected void sorting() {
		for (int i = 0; i < length() - 1; i++) {
			for (int j = i + 1; j < length(); j++) {
				if (compare(i, j) > 0) {
					swap(i, j);
				}
			}
			print();
		}
	}
}

class BubbleSort extends SortInt {
	@Override
	protected void sorting() {
		int pass = 1;
		boolean flag;
		do {
			flag = false;
			for (int i = 0; i < length() - pass; i++) {
				if (compare(i, i + 1) > 0) {
					swap(i, i + 1);
					flag = true;
				}
			}
			print();
		} while (flag);
	}
}