package basic_20170208;

public class A2InvestmentVolume {
	
	public static double calculateVolume (int sumVolume, int mileage) {
		
		return sumVolume/mileage;
	}
	public static void main(String[] args) {
		
		int sumVolume = 2209;
		int mileage = 1318;
		System.out.println("京沪高铁总投资2209亿元");
		System.out.println("高铁总长度1318千米");
		System.out.println("高铁每千米投资额度为" 
				+ calculateVolume(sumVolume, mileage) +"亿元/千米");
		System.out.println("通车时间：2011年");
		System.out.println("运行时间：4.5小时");
		System.out.println("运行速度：350千米/小时");
	}
	
}
