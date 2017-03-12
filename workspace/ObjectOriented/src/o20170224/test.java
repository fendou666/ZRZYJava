package o20170224;

public class test {
	public static void main(String[] args) {
		// 泳衣
		Clothes swimsuit = new Clothes("夏季", "红色", "泳衣");
		// 球衣
		Clothes jersey = new Clothes("夏季", "黄色", "球衣");
		
		Factory fac = new Factory("制衣工厂", "西郊");
		
		fac.makeClothes(swimsuit);
		fac.makeClothes(jersey);
		
		DiveMan tianl = new DiveMan("田亮", swimsuit, "国家队", "双人跳水");
		
		FootballMan  zl = new FootballMan("张琳芃", swimsuit, "国家队", "后卫");
		
		tianl.toString();
		zl.toString();
		
		
		SportMan zm = new DiveMan("田亮", swimsuit, "国家队", "双人跳水");
		
		DiveMan zz = (DiveMan)zm;
		zz.test();
		//jersey = (jersey)fac;
		
		// 经过测试发现，看来引用之间的转换，只有父子类型才有
		Same1 s1 = new Same1();
		Same2 s2 = new Same2();
		
		Same1 s11 = s1;
		Same2 s22 = s2;
		
		//Same2 s21 = (Same2)s1;
		
		
		
	}
}
