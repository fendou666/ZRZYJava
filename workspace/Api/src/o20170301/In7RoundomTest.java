package o20170301;

import java.util.Random;

public class In7RoundomTest {
	public static void main(String[] args) {
		
		Random rm = new Random();
		System.out.println((int)(rm.nextDouble()*33+1));
		System.out.println(Math.round(rm.nextDouble()*33));
		System.out.println((int)(Math.random()*33+1));
		System.out.println(Math.round(Math.random()*33+1));
	}
}
