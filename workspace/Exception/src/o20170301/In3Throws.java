package o20170301;

public class In3Throws {
	
	public  void methodThrow(int a)  {
		
		try {
			if (a>60) {
				throw new Exception("���ݴ���60������������");
			}
		}catch (Exception e) {
			System.out.println("�����е��쳣�ǣ�" + e);
		}
		
		
	}
	
	public  void methodThrows(int a) throws Exception  {
		
		if (a>60) {
			throw new Exception("���ݴ���60������������");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		In3Throws test = new In3Throws();
		test.methodThrow(100);
		// throws�Ľ�������Ҫtry catch ������ throws Exception �����������õķ�����
		test.methodThrows(100);
		
	}
}
