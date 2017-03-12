package o20170227;

public class A1test {
	
	public static void method(A1SportMan test){
		
		if (test instanceof A1DiveMan){
			test.exercise();
		}else {
			System.out.println("这个运动员不是跳水运动员");
		}
		
	
	}
	
	
	public static void main(String[] args) {
		// 泳衣
		A1Clothes swimsuit = new A1Clothes("夏季", "红色", "泳衣");
		// 球衣
		A1Clothes jersey = new A1Clothes("夏季", "黄色", "球衣");
//		
//		A1Factory fac = new A1Factory("制衣工厂", "西郊");
//		
//		fac.makeClothes(swimsuit);
//		fac.makeClothes(jersey);
//		
		A1DiveMan tianl = new A1DiveMan("田亮", swimsuit, "国家队", "双人跳水");
		
		A1FootballMan  zl = new A1FootballMan("张琳芃", jersey, "国家队", "后卫");
		
		System.out.println(tianl.toString());
		System.out.println(zl.toString());
		
		A1SportMan dive = new A1DiveMan("田亮", swimsuit, "国家队", "双人跳水");
		A1SportMan football = new A1FootballMan("张琳芃", jersey, "国家队", "后卫");
		
		method(dive);
		method(football);
		boolean z1 = dive instanceof A1SportMan || football instanceof A1SportMan;
		boolean z2 = dive instanceof A1SportMan && football instanceof A1SportMan;
		boolean z3 = dive instanceof A1DiveMan && football instanceof A1FootballMan;
		boolean z4 = dive instanceof A1FootballMan;
		boolean z5 = football instanceof A1DiveMan;
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
		System.out.println(z4);
		System.out.println(z5);
		
		A1DiveMan test = (A1DiveMan)dive;
		test.test();
		//jersey = (jersey)fac;
		

		
		
		
	}
}
