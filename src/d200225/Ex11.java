package d200225;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex11 {
	public static void main(String[] args) {
		//·Î¶Ç
		Set<Integer> set = new TreeSet<Integer>();
		Random rd = new Random();
		int num;
		
		while(set.size()<6) {
			num = rd.nextInt(45)+1;
			set.add(num);
		}
		System.out.println(set);
	}
}
