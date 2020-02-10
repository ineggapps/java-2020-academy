package d200210;

public class ArgEx {
	public static void main(String[] args) {
		System.out.println("명령형 인수 개수: "+args.length);
		System.out.println("명령행 인수 값...");
		for(String s: args) {
			System.out.println(s);
		}
		
//		for(int i=0;i<args.length;i++) {
//			System.out.println(args[i]);
//		}
	}
}
