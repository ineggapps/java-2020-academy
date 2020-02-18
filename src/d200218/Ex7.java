package d200218;

import java.text.ChoiceFormat;

public class Ex7 {
	public static void main(String[] args) {
		//#, < 두 가지는 "limit#value" "limit<value" 형태로 작성한다.
		//<는 경곗값을 포함하지 않고, #은 경곗값을 포함한다.
		String p = "0#F|60#D|70#C|80<B|90#A";
		int []ss= {20,99,95,88,70,52,60,100,80,50};
		ChoiceFormat f = new ChoiceFormat(p);
		
		for(int s:ss) {
			System.out.println(s+"의 등급은 " + f.format(s)+"등급입니다.");
		}
	}
}
