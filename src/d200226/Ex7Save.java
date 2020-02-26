package d200226;

import java.io.FileOutputStream;
import java.util.Properties;

public class Ex7Save {
	public static void main(String[] args) {
		// Hashtable 클래스를 상속 받음
		// 키와 값이 문자열만 가능하다.
		// 파일 저장 및 불러오기가 간단해서 환경설정 등에서 많이 사용된다.
		Properties p = new Properties();
		// Properties는 제네릭이 없다
		// Properties 역시 put() 메서드를 사용할 수 있으나 권장하지 않는다.
		// 키와 값을 저장한다.
		p.setProperty("자바", "80");
		p.setProperty("스프링", "90");
		p.setProperty("서블릿", "85");
		p.setProperty("오라클", "90");
		p.setProperty("HTML", "100");

		String pathname = "subject.properties";
		try (FileOutputStream fos = new FileOutputStream(pathname)) {
			p.store(fos, "과목별 성적");
			System.out.println("파일 저장 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
