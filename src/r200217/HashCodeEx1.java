﻿package r200217;

public class HashCodeEx1 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
	}
}
