package o20170301;

public class In4Test {

	
	public static void main(String[] args)  {
		
		int i = 100;
		if (i>60) {
			try {
				throw new In4CustomException("自定义异常，大于60就抛出异常");
			} catch (In4CustomException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
