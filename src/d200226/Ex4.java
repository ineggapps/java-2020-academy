package d200226;

import java.util.LinkedList;
import java.util.Queue;

public class Ex4 {
	public static void main(String[] args) {
		// Queue 예제 (LinkedList) FIFO 구조
		Queue<String> q = new LinkedList<>();
		q.offer("자바");// 큐의 마지막에 요소 삽입
		q.offer("오라클");// 큐의 마지막에 요소 삽입
		q.offer("서블릿");// 큐의 마지막에 요소 삽입
		q.offer("스프링");// 큐의 마지막에 요소 삽입
		q.offer("안드로이드");// 큐의 마지막에 요소 삽입

		//peek(): head 반환
		//poll(): head 반환 후 요소 지움.
		
		//반복문에 진입할 때 queue에 데이터가 차 있지 않을 수도 있다는 경우의 수를 감안하라!
		while (q.peek() != null) {
			String s = q.poll();
			System.out.print(s+" ");
		}
		System.out.println();

	}
}
