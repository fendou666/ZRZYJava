package o20170301;

public class In4Test {

	
	public static void main(String[] args)  {
		
		int i = 100;
		if (i>60) {
			try {
				throw new In4CustomException("�Զ����쳣������60���׳��쳣");
			} catch (In4CustomException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
