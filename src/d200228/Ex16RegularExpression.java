package d200228;

import java.util.regex.Pattern;

public class Ex16RegularExpression {
	public static void main(String[] args) {
		String s, p;
//		p="\\d{1,3}";//¼ıÀÚ°¡(\\d) Ã¹ Â° ÀÚ¸®¿¡¼­ ¼Â Â° ÀÚ¸®±îÁö ÀÖ¾î¾ß ÇÔ({1,3})
//		s="100";
		
//		 ¿å¼³ ÇÊÅÍ¸µ
//		p=".*(?i)(ac|¹Ùº¸).*"; ¿©±â¼­ (?i)´Â ´ë¼Ò¹®ÀÚ¸¦ ±¸ºĞÇÏÁö ¾ÊÀ½.
//		s="¿ì¸® ¹Ùº¸ ³Ê ac ÈÄÈÄ";//"¹Ùº¸" "ac" ¶Ç´Â "AC" ¿å¼³ ÇÊÅÍ¸µ
		
//		ÇÑ±Û¸¸ 2~10±ÛÀÚ
//		p = "[°¡-ÆR]{2,10}";
//		s = "ÇÑ±Û¸¸ÀÛ¼ºÀÌ°¡´É";
		
//		ÇÑ±Û 1ÀÚ ÀÌ»ó
//		p = "^[°¡-ÆR]+$";//ÇÑ±Û 1ÀÚ ÀÌ»ó
//		s="Å©Å©Å©";

		//		//¿å¼³ ÇÊÅÍ¸µ advanced (Áß°£¿¡ ¼ıÀÚ¸¦ ÀÔ·ÂÇß¾îµµ °¨ÁöÇÏ±â)
//		s="¿ì¸® ¹Ù1º¸ ³Ê a1c ÈÄÈÄ";
//		s = s.replaceAll("\\d", "");
//		p = ".*(?i)(ac|¹Ùº¸).*";
//		System.out.println(s);
		
		p="c.*t";//c·Î ½ÃÀÛÇÏ°í c´ÙÀ½ÀÇ .* (¸ğµç ¹®ÀÚ¿­ÀÌ 0°³ ÀÌ»ó) t·Î ³¡³ª¾ß ÇÑ´Ù.
//		s="cbasbt";//true
//		p="c*t";//c°¡ 0°³ ÀÌ»óºÎÅÍ
		
		System.out.println(s.replaceAll(p, ""));
		if (Pattern.matches(p, s)) {
			System.out.println("°¡´É");
		} else {
			System.out.println("ºÒ°¡´É");
			;
		}

	}
}
