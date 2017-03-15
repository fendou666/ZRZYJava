package o20170301;

import java.util.Random;

public class A1DoubleChromosphere {
	
	public static boolean check(boolean  [][][][][][][] total, 
			int [] red, int blue){
		
		return total  	[blue-1]
						[red[5]-1][red[4]-1]
						[red[3]-1][red[2]-1]
						[red[1]-1][red[0]-1]; 
	}
	
	public static void main(String[] args) {
//		boolean  [][][][][][][] total 
//			= new boolean[16][33][33][33][33][33][33];
//		for (int j = 0; j<16; j++) {
//			for (int k = 0; k<33; k++) {
//				for (int l = 0; l<33; l++) {
//					for (int m = 0; m<33; m++) {
//						for (int n = 0; n<33; n++) {
//							for (int o = 0; o<33; o++) {
//								for (int p = 0; p<33; p++) {
//									total[j][k][l][m][n][o][p] = false;
//								}	
//							}	
//						}	
//					}	
//				}
//			}
//		}
		
		Random rm = new Random();
		
		int [] red = new int[6];
		int blue = 0;
		System.out.print("双色球号码是：");
		for (int i=0;i<red.length; i++) {
			red[i] = (int)(rm.nextDouble()*33 + 1);
			System.out.print(red[i] + "\t");
		}
		blue = (int)(rm.nextDouble()*16 + 1);
		System.out.print(blue + "\t");
		
//		if(check(total, red, blue)){
//			System.out.println("这个双色球已经存在");
//		}else {
//			System.out.println("这个双色球不存在");
//		}
		
		
	}
}
