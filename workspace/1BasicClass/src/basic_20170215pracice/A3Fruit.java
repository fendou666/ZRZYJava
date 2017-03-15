package basic_20170215pracice;

import java.util.Scanner;

public class A3Fruit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ÇëÊäÈë¼¾½Ú");
		String season = input.next();
		
		switch (season) {
		case "´º¼¾":
			System.out.println("ÌÒ×Ó¡¢ĞÓ¡¢Àî×Ó");
			break;
		case "ÏÄ¼¾":
			System.out.println("Î÷¹Ï¡¢Ïã¹Ï¡¢¹şÃÜ¹Ï¡¢Ïã½¶¡¢Ã¢¹û¡¢»ğÁú¹û");
			break;
		case "Çï¼¾":
			System.out.println("¹ğÔ²¡¢ÆÏÌÑ¡¢ÀóÖ¦¡¢Àæ¡¢ÉîÇï¼¾½ÚÊÁ×Ó");
			break;
		case "¶¬¼¾":
			System.out.println("Ó£ÌÒ·¬ÇÑ ÑîÌÒ ¸ÌéÙ³È ÇàÔæ ¸Ê¹ûÕá ²İİ® ·¬Ê¯Áñ ");
			break;
			default :
				System.out.println("ÊäÈë´íÎó");
		}
		input.close();
	}
}
